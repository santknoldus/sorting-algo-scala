package com.knoldus.sortinglist

case class BubbleSort() {
  def getLargest(data: List[Int]): (Int, List[Int]) =
    data match {
      case head :: Nil => (head, Nil)
      case head :: tail =>
        val (large, remaining) = getLargest(tail)
        if (large > head)
          (large, head :: remaining)
        else
          (head, large :: remaining)
    }

  def bubbleSort(data: List[Int]): List[Int] =
    data match {
      case Nil => Nil
      case _ =>
        val (greatest, tail) = getLargest(data)
        bubbleSort(tail) ::: List(greatest)
    }
}


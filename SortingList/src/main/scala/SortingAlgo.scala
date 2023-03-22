package com.knoldus.sortinglist

case class BubbleSort() {

  // bubble sort
  def bubbleSort(data: List[Int]): List[Int] = {
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
    data match {
      case Nil => Nil
      case _ =>
        val (greatest, tail) = getLargest(data)
        bubbleSort(tail) ::: List(greatest)
    }
  }

  //insertion sort
  def insertionSort(list: List[Int]): List[Int] = {
    def insert(number: Int, sortedList: List[Int]): List[Int] =
      if(sortedList.isEmpty || number <= sortedList.head) number :: sortedList
      else sortedList.head :: insert(number, sortedList.tail)

    if (list.isEmpty || list.tail.isEmpty) list
    else insert(list.head, insertionSort(list.tail))
  }

}


package com.knoldus.sortinglist

import org.scalatest.funsuite.AnyFunSuite

class SprtingAlgoTest extends AnyFunSuite {

  val list: List[Int] = List(1, 5, 3, 2)

  test("bubble sort") {
    assert(BubbleSort().bubbleSort(list) === List(1, 2, 3, 5))
  }

  test("insertion sort") {
    assert(BubbleSort().insertionSort(list) === List(1, 2, 3, 5))
  }

}

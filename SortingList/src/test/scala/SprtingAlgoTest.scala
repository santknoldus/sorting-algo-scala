package com.knoldus.sortinglist

import org.scalatest.funsuite.AnyFunSuite

class SprtingAlgoTest extends AnyFunSuite {
  test("Test1") {
    val list1 = List(1, 5, 3, 2)
    assert(BubbleSort().bubbleSort(list1) === List(1, 2, 3, 5))
  }

  test("Test3") {
    val list3 = List(4, 2, 3)
    assert(BubbleSort().bubbleSort(list3) != List(4, 2, 3))
  }

}

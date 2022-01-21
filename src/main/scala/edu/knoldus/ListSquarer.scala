package edu.knoldus

import scala.annotation.tailrec

class ListSquarer {
  @tailrec
  final def squareList(list: List[Int], accumulator: List[Int] = List()): List[Int] = {
    list match {
      case List() => accumulator
      case head :: tail => squareList(tail, accumulator :+ (head * head))
    }
  }

  def squareListUsingMap(list: List[Int]): List[Int] = {
    list map (element => element * element)
  }
}

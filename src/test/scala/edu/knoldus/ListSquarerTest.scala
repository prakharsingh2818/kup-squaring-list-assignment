package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ListSquarerTest extends AnyFlatSpec {
  val squareTheList = new ListSquarer
  val valueOne = 0
  val valueTwo: Int = -2
  val valueThree = 9
  val originalList = List(valueOne, valueTwo, valueThree)
  val expectedResult = List(valueOne * valueOne, valueTwo * valueTwo, valueThree * valueThree)

  "squareList" should "square the elements" in {
    val actualResult = squareTheList.squareList(originalList)
    assertResult(expectedResult)(actualResult)
  }

  "squareListUsingMap" should "square the elements using map method" in {
    val actualResult = squareTheList.squareListUsingMap(originalList)
    assertResult(expectedResult)(actualResult)
  }
}

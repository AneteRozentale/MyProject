package com.github.aneterozentale

import scala.collection.mutable.ArrayBuffer

object ExerciseCookBook extends App {
  val srcFolder = "src/resources/pg13177.txt"
  val dstFolder = "src/resources/pg13177_cleaned.txt"
  val lines = Utilities.getLinesFromFile(srcFolder) //utilities taken from lectures ValRCS

  val text = lines.mkString("\n")


  val rgxForTitle = "[\\n\\n]+[A-Z]+[\\s].*".r
  val title = rgxForTitle.findAllIn(text).toArray
  title.foreach(println)

  val rgxForIngredients = "    +[0-9].*".r
  val ingredients = rgxForIngredients.findAllIn(text).toArray
  ingredients.foreach(println)


  val resultsBuffer = ArrayBuffer[String]()
  resultsBuffer ++= title
  resultsBuffer ++= ingredients
  val resultsFinalized = resultsBuffer.toArray


Utilities.saveLines(dstFolder,resultsFinalized)
}


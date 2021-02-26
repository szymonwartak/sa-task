package szymon.superawesome

import org.scalatest._

import java.io.StringWriter

class AnagramGrouperTest extends FreeSpec {
  val anagramGrouper = new AnagramGrouper(new StringWriter())

  "example1.txt" - {
    val wordList = List("abc", "fun", "bac", "fun", "cba", "unf", "hello")
    val result = anagramGrouper.groupWordsOfSameLength(wordList)
    assert(result.length == 3)
  }

  "empty list" - {
    val wordList = List()
    val result = anagramGrouper.groupWordsOfSameLength(wordList)
    assert(result.length == 0)
  }
}

package szymon.superawesome

import org.scalatest._

import java.io.StringWriter

class AnagramGrouperTest extends FreeSpec {
  val writer = new StringWriter()
  val anagramGrouper = new AnagramGrouper(writer)

  "example1.txt" - {
    val wordList = List("abc", "fun", "bac", "fun", "cba", "unf", "hello")
    val grouped = anagramGrouper.groupWordsOfSameLength(wordList)

    "group length" in {
      assert(grouped.length == 3)
    }
  }

  "empty list" - {
    val wordList = List()
    val grouped = anagramGrouper.groupWordsOfSameLength(wordList)

    "group length" in {
      assert(grouped.length == 0)
    }

    "text output check" in {
      writer.getBuffer().setLength(0)
      anagramGrouper.printGroups(grouped)
      assert(writer.toString == "")
    }
  }
}

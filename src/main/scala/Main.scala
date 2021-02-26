
import szymon.superawesome.AnagramGrouper

import java.io.PrintWriter
import scala.io.Source


object Main extends App {
  if (args.length == 0) {
    println("file name argument needed")
  }

  // initialize grouper with output to System.out
  val anagramGrouper = new AnagramGrouper(new PrintWriter(System.out))

  val filename = args(0)
  var wordIterator: Iterator[String] = Source.fromFile(filename).getLines()

  // iterate through words, loading same lengths words before grouping + outputting. Then continue to next length words
  var previousLength = 0
  while (wordIterator.hasNext) {
    val next = wordIterator.next()
    if (previousLength > next.size)
      throw new Exception("words not in size order")

    wordIterator.span(_.size == next.size) match {
      case (_words, rest) =>
        val words = next :: _words.toList
        val groupedWords = anagramGrouper.groupWordsOfSameLength(words)
        anagramGrouper.printGroups(groupedWords)
        wordIterator = rest
    }
  }
}
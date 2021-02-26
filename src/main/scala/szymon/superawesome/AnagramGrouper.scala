package szymon.superawesome

import java.io.{PrintWriter, Writer}

/**
 * Functions related to grouping anagrams
 * @param writer - for outputting words
 */
class AnagramGrouper(writer: Writer) {
  /**
   * @param words - list of words of same length
   * @return - inner list is grouped anagrams
   */
  def groupWordsOfSameLength(words: List[String]): List[List[String]] = {
    words.groupBy(_.toList.sorted).map(_._2).toList
  }

  /**
   * output groups to class defined writer
   * @param wordGroups - grouped words
   */
  def printGroups(wordGroups: List[List[String]]): Unit = {
    wordGroups.foreach(g => {
      writer.write(s"${g.mkString(",")}\n")
    })
    writer.flush()
  }
}
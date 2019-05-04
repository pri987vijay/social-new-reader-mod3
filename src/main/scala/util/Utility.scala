package util

import defineTags.Tag

/**
  * This object includes all the functions related to this module
  */
object Utility {

  /**
    *
    * @param mainStr string on which tags has to appended
    * @param items Array of(Start, end , specified tag)
    * @return
    */
  def process(mainStr: String, items: Array[(Int, Int, Tag)]): String = {

  var str = mainStr
  var substitute = 0

  items.sortBy(_._1).map { item =>
    val start = item._1 + substitute
    val end = if (item._2 + substitute < str.length) item._2 + substitute else str.length
    val sub = str.substring(start, end)
    str = item._3.appendTag(str, item._3.htmlTag, start, end, sub)
    substitute = substitute + item._3.affectedLength + item._3.getSubLength(sub)
  }
    return str
}

  /**
    * add one tag at a time in starting and ending.
    * @param str main string
    * @param wrapperStr tag value like <strong>???</strong>
    * @param start starting point to include starting tag
    * @param end strating point to including closing tag
    * @param sub  substring of inbetween tag
    * @return
    */
  def appendHtmlTags(str: String, wrapperStr: String, start: Int, end: Int, sub: String): String = {
    s"${str.substring(0, start)}${wrapperStr.replace("???", sub)}${str.substring(end, str.length)}"
  }
}
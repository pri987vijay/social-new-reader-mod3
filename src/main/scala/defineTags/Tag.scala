package defineTags

import util.Utility
/**
  * This is an trait(Interface in java) class
  * to have the property of all the tags(Entity/Link/TwitterUserName/etc)
  * @htmlTag -> starting and closing tag
  * @affectedLength -> string length affected by, after adding html tag
  * @appendTag -> add tag one by one
  */
trait Tag {

  def htmlTag: String

  def affectedLength: Int

  def appendTag(str: String, wrapperStr: String, start: Int, end: Int, sub: String): String =
    Utility.appendHtmlTags(str, wrapperStr, start, end, sub)

  def getSubLength(sub:String):Int

}
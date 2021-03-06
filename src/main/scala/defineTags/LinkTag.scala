package defineTags

/**
  * This is a case class of Link type tag which extends Tag trait
  * and it declares all the attributes of parent trait
  */
case class LinkTag() extends Tag {

  val target = "???"

  override def htmlTag = s"<a href='${target}'>${target}</a>"

  override def affectedLength: Int = htmlTag.length - target.length * 2

  override def getSubLength(sub: String): Int = sub.length
}
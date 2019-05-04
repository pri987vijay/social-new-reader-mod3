package defineTags

/**
  * This is a case class of Twitter User name type tag which extends Tag trait
  * and it declares all the attributes of parent trait
  */
case class TwitterLinkTag() extends Tag {

  val target = "???"

  override def htmlTag = s"<a href='http://twitter.com/${target}'>${target}</a>"

  override def affectedLength: Int = htmlTag.length - target.length * 2

  override def getSubLength(sub: String): Int = sub.length

}
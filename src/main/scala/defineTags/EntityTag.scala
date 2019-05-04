package defineTags

/**
  * This is a case class of Entity type tag which extends Tag trait
  * and it declares all the attributes of parent trait
  */
case class EntityTag() extends Tag {

  val target = "???"

  override def htmlTag = s"<strong>${target}</strong>"

  override def affectedLength: Int = htmlTag.length - target.length

  override def getSubLength(sub: String): Int = 0
}
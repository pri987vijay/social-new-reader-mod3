import defineTags.{EntityTag, LinkTag, Tag, TwitterLinkTag}

object Main {
  /**
    * This is the main function used to creates a object of GetString class and produces the final output
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val mod1Input: String = "Obama visited Facebook headquarters: http://bit.ly/xyz @elversatile"

    /* mod2Output is an output of module 2.
    And in this code I have considered this as a tuple of Array of StartPoint,EndingPoint and Tag object
    which defines whether the info is of type Entity/Link/Twitter Username/etc */

    val mod2Output: Array[(Int, Int, Tag)] = Array((14, 22, EntityTag()), (0, 5, EntityTag()), (56, 68, TwitterLinkTag()), ((37, 54, LinkTag())))

    val mod3Output = util.Utility.process(mod1Input, mod2Output)

    println(s"Final Output of 3rd Module => ${mod3Output}")

    /*Note: I have tried multiple other inputs as well mentioned below and are commented*/
//    println(new GetString().process("visited Facebook headquarters: http://bit.ly/xyz Obama @elversatile Obama visited Facebook headquarters: http://bit.ly/xyz @elversatile",
//      Array((68 + 14, 68 + 22, entityTag()), (14 - 6, 22 - 6, entityTag()), (49, 54, entityTag()), (68, 68 + 5, entityTag()), (56, 67, twitterLinkTag()),
//        (68 + 56, 68 + 67, twitterLinkTag()), (37 - 6, 54 - 6, linkTag()), (68 + 37, 68 + 54, linkTag()))))

  }
}
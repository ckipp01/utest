package utest

/**
 * Created by haoyi on 2/5/14.
 */
object Main {
  def main(args: Array[String]): Unit = {
    intercept[NullPointerException]{
      (0: Any) match { case _: String => }
    }
  }
}

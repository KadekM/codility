import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
      val n = A.length
      val B = new Array[Boolean](n)
      A.foreach(x => if (x >= 1 && x <= n) B(x-1) = true)
      B.zipWithIndex.find(_._1==false) match {
        case Some((_, k)) => k+1
        case None => n+1
      }
    }
}

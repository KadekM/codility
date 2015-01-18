import scala.collection.JavaConversions._
import scala.util.control.Breaks._

object Solution {
    def solution(A: Array[Int]): Int = {
      val n  = A.length
       val B = A.sortWith(_ < _).map(_.toLong)
       
       for (i <- 0 until n) {
           breakable {
             for (j <- i + 1 until n-1) {
                  if (B(i) + B(j) <= B(j+1)) break
                  else return 1
               }
             }
       }
       0
    }
}

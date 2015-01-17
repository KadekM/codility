import scala.collection.JavaConversions._


object Solution {
    def solution(A: Array[Int]): Int = {
        val n = A.length
        val B = new Array[Boolean](n)
        for (x <- A) {
          if (x > n || B(x-1)) return 0
          else B(x-1) = true
        }
        return 1
    }
}

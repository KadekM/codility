import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
        val N = A.length
        val sum: Long = ((1+(N+1)).toLong*(N+1)/2) //Sn+1
        val got: Long = A.foldLeft(0L)((x, a) => a + x.toLong)
        (sum-got).toInt
    }
}

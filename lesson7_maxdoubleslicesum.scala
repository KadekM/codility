import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
      val n = A.length
      if (n == 3) return 0
      
      val forward = new Array[Int](n)
      val backward = new Array[Int](n)
     
     for (i <- 1 until n) forward(i) = math.max(0, forward(i-1)+A(i))
     for (i <- n-2 until 0 by -1) backward(i) = math.max(0, backward(i+1) + A(i))
     
     var max = 0
     for (i <- 1 until n-1) {
       val sum = forward(i-1)+backward(i+1)
       if (sum > max) max = sum
     }
     max
    }
}
import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
       val total = A.reduceLeft((x, acc) => acc + x)
       val N = A.length
       
       var left = A(0)
       val r = (total-left)
       var min = math.abs(left - r)
       
       for (i <- 1 until N-1) {
          left += A(i)
          val right = total - left
          val dif = math.abs(right-left)
          
          if (dif < min) min = dif   
       }
       
       min
    }
}

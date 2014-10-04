import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
       
       var smallest = A(0)
       
       var maxEnding = smallest
       var maxSlice = smallest
       
       for (i <- 1 until A.length) {
           val x = A(i)
           
          maxEnding = math.max(x, maxEnding+x)
          maxSlice = math.max(maxSlice, maxEnding)
       }
       
       maxSlice
    }
}

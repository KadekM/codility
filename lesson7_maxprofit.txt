import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
        if (A.length <= 1) {
          return 0   
        }
        
        var maxEnding = 0
        var maxSlice = 0
        var minPrice = A(0)
        
        for (i <- 1 until A.length) {
            maxEnding = math.max(0, A(i)-minPrice)
            maxSlice = math.max(maxEnding, maxSlice)
            minPrice = math.min(minPrice, A(i))
        }
        
        maxSlice
    }
}
import scala.collection.JavaConversions._

object Solution {
    def solution(N: Int): Int = {
        var x = N
        var m = -1
        var max = 0
        
        while (x > 0) {
          val r = x & 1
          x = x >> 1
          if (r == 0) {
              if (m >= 0)  m += 1
          } else m = 0  
          
          max = math.max(max, m)   
        }

        return max;
    }
}

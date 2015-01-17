import scala.collection.JavaConversions._

object Solution {
    def solution(N: Int, A: Array[Int]): Array[Int] = {
        var max = 0
        var cmax = 0

        val B = new Array[Int](N)
        
        for (x <- A) {  
          if (x == N+1) max = cmax  
          else {
            if (B(x-1) < max) B(x-1) = max + 1
            else B(x-1) += 1
            cmax = math.max(cmax, B(x-1))
          }
        }
        
        B.transform(x => if (x < max) max else x)
        B
    }
}

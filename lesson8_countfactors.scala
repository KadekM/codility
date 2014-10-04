import scala.collection.JavaConversions._

object Solution {
    def solution(N: Int): Int = {
        var i = 1L
        var result = 0
        
        while (i*i < N) {
            if (N % i == 0) result += 2   
            i += 1
        }
        
        if (i*i == N) result += 1
        
        result
    }
}
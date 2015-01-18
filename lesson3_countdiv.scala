import scala.collection.JavaConversions._

object Solution {
    def solution(A: Int, B: Int, K: Int): Int = {
     var cnt = 0
     if (A % K == 0) cnt += 1 
     cnt += (B/K - A/K)
     cnt
    }
}

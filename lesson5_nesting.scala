import scala.collection.JavaConversions._


object Solution {
    def solution(S: String): Int = {
        var sum=0
        
        for (x <- S) {
          if (x == '(') sum += 1
          if (x == ')') sum -= 1
          if (sum < 0) return 0
        }
        
        if (sum==0) 1 else 0
    }
}
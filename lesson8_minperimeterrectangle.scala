import scala.collection.JavaConversions._

object Solution {
    def solution(N: Int): Int = {
        val sqrt = math.sqrt(N)
        var ceil = math.ceil(sqrt)
        for (b <- ceil to 1 by -1) {
          val a = N/b
          if (a == a.toInt) {
            return (2*(a+b)).toInt   
          }
        }
        return 0
    }
}
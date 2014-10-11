import scala.collection.JavaConversions._
import scala.annotation._

object Solution {
    def solution(N: Int, M: Int): Int = {
        @tailrec
        def gcd(a: Int, b: Int): Int = if ((a % b)==0) b else gcd(b, a%b)
        
        N/gcd(N,M)
    }
}

import scala.collection.JavaConversions._

object Solution {
    def solution(S: String): Int = {
        val n = S.length
        if (n == 1) return 0
        else if (n%2 != 1) return -1
        else {
          val mid = ((n-1)/2).toInt
          val len = (n/2).toInt
          val l = S.substring(0, len)
          val r = S.substring(mid+1, mid+1+len).reverse
          if (l==r) return mid
          else return -1
        }
    }
}

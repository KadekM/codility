import scala.collection.JavaConversions._
import scala.annotation._
import scala.util.control.Breaks._

object Solution {
     def solution(A: Array[Int], B: Array[Int]): Int = {
    val N = A.length
    var res = 0

    @tailrec
    def gcd(x: Int, y: Int): Int = if (y==0) x else gcd(y, x%y)

    def same(x: Int, y: Int): Boolean = {
      if (x == y ) return true

      else if (x > y) same(y,x)
      else {
        val gec = gcd(x,y)
        if (gec == 1) return false

        var a = x
        breakable {
          while (a != 1) {
            val gecd = gcd(a, gec)
            if (gecd == 1) break
            a /= gecd
          }
        }

        if  (a != 1) return false

       var b = y
       breakable {
         while (b != 1) {
           val gecd = gcd(b, gec)
           if (gecd == 1) break
           b /= gecd
         }
       }

        return b==1
      }
    }

    for (i <- 0 until N) {
      if (same(A(i), B(i))) res += 1
    }

    res
  }
}

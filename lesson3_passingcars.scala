import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
        A.foldLeft((0, 0)){
          case ((total, _), _) if (total < 0 || total > 1000000000) => (-1, 0) 
          case ((total, cars), x) if x == 0 => (total, cars+1)
          case ((total, cars), x) if x == 1 => (total+cars, cars)
        }._1
    }
}

/* 
+++ We could try to terminate early (since fold goes through whole list (which is ok for O(N) though)

def trav[A, B](xs: Iterable[A])(z: B)(f: (B, A) => Option[B]): Option[B] = {
  var acc = z
  var these = xs
  while (!these.isEmpty) {
    f(z, these.head) match {
      case None => return None // early terminate
      case Some(x) => acc = x
    }
    these = these.tail
  }
Some(acc)
}

...

trav(A)((0, 0)) {
  case ((total, _), _) if total > 1000000000 => None
  case ((total, cars), x) if x == 0 => Some(total, cars+1)
  case ((total, cars), x) if x == 1 => Some(total+cars, cars)
}

+++ But this seems to be much much slower (codility even thinks it's N^2

+++ Fastest could be imperative solution with single loop and break out it in it
*/

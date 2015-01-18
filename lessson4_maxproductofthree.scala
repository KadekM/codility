import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
      val n = A.length
      scala.util.Sorting.quickSort(A)
      math.max(A(0)*A(1)*A(n-1), A(n-1)*A(n-2)*A(n-3))
    }
}

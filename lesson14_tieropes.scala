import scala.collection.JavaConversions._

object Solution {
    def solution(K: Int, A: Array[Int]): Int = {
        A.foldRight((0, 0))((x, acc) => {
          acc match {
            case (num, sum) if sum+x >= K => (num+1, 0)
            case (num, sum) => (num, sum+x)
          }
        })._1
    }
}

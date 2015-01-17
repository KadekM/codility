import scala.collection.JavaConversions._

object Solution {
    def solution(X: Int, A: Array[Int]): Int = {
       val B = new Array[Boolean](X+1)
       var rem = X
       
       for ( (p,i) <- A.zipWithIndex ) {
         if (p <= X && !B(p)) {
           B(p) = true
           rem -= 1
         }
         if (rem == 0) return i
       }
       
       return -1
    }
}

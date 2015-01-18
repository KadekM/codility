import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
        val n = A.length
        var min: Double = (A(0)+A(1)) /2.0
        for (i <- 0 until n-1) min = math.min(min, (A(i)+A(i+1))/2.0)
        for (i <- 0 until n-2) min = math.min(min, (A(i)+A(i+1)+A(i+2))/3.0)
        for (i <- 0 until n-1){
            if ((A(i)+A(i+1))/2.0 == min) return i
            if (i < n-2 && ((A(i)+A(i+1)+A(i+2))/3.0 == min)) return i
        }
            
        throw new UnsupportedOperationException("This should never happen")
    }
}

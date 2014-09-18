import scala.collection.JavaConversions._

object Solution {
    def solution(A: Array[Int]): Int = {
        val N = A.length
        
        var value :Option[Int] = None
        var size = 0
        
        for (i <- 0 until N) {
            if (size == 0) {
                size += 1
                value = Some(A(i) )
            } else {
                value match {
                   case Some(x) if x == A(i) => size += 1
                   case _ => size -=1
                }
            }
        }
        
        var candidate = -1
        var count = 0
        if (size > 0) {
         candidate = value.get   
        }
        
        for (i <- 0 until N) {
            
          if (A(i) == candidate) {
           count+=1
           
           if (count > N/2) {
               return i
           }
          }
        }
        
        -1
    }
}
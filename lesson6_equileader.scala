import scala.collection.JavaConversions._

object Solution {

    def solution(A: Array[Int]): Int = {
        val N = A.length
        
        var leader = A(0)
        var size = 1
        
        for (i <- 1 until N) {
          if (A(i) == leader) {
            size += 1   
          } else {
            size -= 1
          }
          
          if (size == 0) {
            size = 1
            leader = A(i)
          }  
        }
        
        var total = 0
        for (x <- A) {
          if (x == leader) total += 1   
        }
        
        if (total <= N/2) {
          return 0   
        }
        
        var counter = 0
        var leftLeaders = 0
        for (i <- 0 until N) {
           val x = A(i)
           if (x == leader) leftLeaders += 1
           val rightLeaders = total - leftLeaders
           
           if ( (leftLeaders > (i+1)/2)  && (rightLeaders > (N-i-1)/2) ) counter += 1
        }
        
        counter
    }
}
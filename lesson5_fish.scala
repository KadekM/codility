import scala.collection.JavaConversions._


object Solution {
    def solution(H: Array[Int]): Int = {
        val N = H.length
        var stones = 0
        val stack = new collections.mutable.Stack[Int]()
        var stackNum = 0
        
        for (i <- 0 until N) {
         
           while (stackNum > 0 && stack(stackNum-1)>H(i))
             stackNum -= 1
             
          if (stackNum > 0 && stack(stackNum-1) == H(i)) {
              
          } else {
            stones += 1
            stack(stackNum) = H(i)
            stackNum += 1
          }
            
        }
    }
}

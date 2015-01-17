import scala.collection.JavaConversions._

object Solution {
    def solution(X: Int, Y: Int, D: Int): Int = 
      math.ceil( (Y-X*1.0)/D ).toInt
}

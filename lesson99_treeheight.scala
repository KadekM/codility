import scala.collection.JavaConversions._

object Solution {
    def solution(T: Tree): Int = {
        
        def height(T : Tree) : Int = {
              if (T.l == null && T.r == null) return 0   
              else if (T.l == null) return 1+height(T.r)
              else if (T.r == null) return 1+height(T.l)
              else 1+math.max(height(T.l), height(T.r))
        }
        
        height(T)
    }
}

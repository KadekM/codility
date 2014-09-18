import scala.collection.JavaConversions._

object Solution {
    def solution(S: String): Int = {
       val stack = new collection.mutable.Stack[Char]()
       val open = Set[Char]('(', '[', '{')
       val closed  = Set[Char](')', ']', '}')
       val closedToOpen = Map[Char,Char](')'->'(',']'->'[','}'->'{')
       
       for (x <- S) {
           if (open contains x) {
              stack.push(x)   
           }
           
           if (closed contains x) {
             if (stack.isEmpty) return 0        
             if (stack.pop != closedToOpen(x)) return 0
           }
       }
       
       if (stack.isEmpty) return 1 else return 0
    }
}
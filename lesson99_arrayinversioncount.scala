import scala.collection.JavaConversions._

object Solution {
    
    def mergeSort(A: Array[Int]):(Array[Int], Int) = {
      var inversions = 0
  
      def split(A: Array[Int]) : (Array[Int], Array[Int]) = {
        if (A.length <= 1) (A, Array())
        else {
          val n = A.length/2
          (A.take(n), A.drop(n))
        }
      }
  
      def merge(A: Array[Int], B: Array[Int]): Array[Int] = {
        if (A.size==0 && B.size==0) return Array[Int]()
        else if (A.size==0) return B
        else if (B.size==0) return A
  
        val (m, n, q) = (A.length, B.length, A.length + B.length)
        val result = new Array[Int](q)
        var i, j, k = 0
  
        def putElement(x: Int) = {
          result(k) = x
          k += 1
        }
  
        while (i < m) {
          while (j < n && B(j) < A(i)) {
            putElement(B(j))
            j += 1
            inversions += A.size-i
          }
  
          putElement(A(i))
          i += 1
        }
  
        while (j < n) {
          putElement(B(j))
          j += 1
        }
  
        result
      }
  
      if (A.length <= 1) return (A, 0)
  
      val (a,b) = split(A)
      val ax = mergeSort(a)
      val bx = mergeSort(b)
      (merge(ax._1, bx._1), inversions+ax._2+bx._2)
    }
  
    def solution(A: Array[Int]): Int = {
       mergeSort(A)._2
    }
}

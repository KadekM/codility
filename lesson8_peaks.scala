import scala.math._
import scala.util.control.Breaks._
object Solution {
  def solution(A: Array[Int]): Int = {
    val N = A.length
    var blockSize = -1
    val peaks = new Array[Boolean](N)
    var amountOfPeaks = 0

    for {
      i <- 1 to N - 2
      if A(i - 1) < A(i) && A(i + 1) < A(i)
    } {
      peaks(i) = true
      amountOfPeaks += 1
    }

    if (amountOfPeaks == 0) return 0

    blockSize = ceil(N / amountOfPeaks).toInt

    def hasPeak(from: Int, to: Int): Boolean = {
      for (i <- from to to) 
        if (peaks(i)) return true
        
      return false
    }

    def amountOfBlocks = N / blockSize

    while (blockSize <= N) {
      while (N % blockSize != 0) blockSize += 1

      var allOk = true
      breakable {
        for (i <- 0 until N - 1 by blockSize) {
          if (!hasPeak(i, i + blockSize-1)) {
            allOk = false
            break
          }
        }
      }

      if (allOk) return amountOfBlocks
      blockSize += 1
    }

    0
  }
}
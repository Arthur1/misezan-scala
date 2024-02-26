package io.github.arthur1.misezan

extension (i: Int)
  def mise(j: Int): BigDecimal = {
    (i min j, i max j) match {
      case (6, 9)       => 11
      case (2, 5)       => 1.1
      case (1, 100)     => 83
      case (small, big) => if (small == big) 0 else big
    }
  }

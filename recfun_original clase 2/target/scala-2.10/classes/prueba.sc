object prueba {
  
  
    println("Pascal's Triangle")
    for (row <- 0 to 50) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
                                                  //> main: (args: Array[String])Unit

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if (c == 0 && r == 0) 1
                   else if (c < 0 || r < 0) 0 else pascal(c, r - 1) + pascal(c - 1, r - 1)
                                                  //> pascal: (c: Int, r: Int)Int
                                                  //> res0: Int(4) = 4
  
}
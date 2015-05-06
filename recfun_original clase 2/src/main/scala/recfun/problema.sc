package recfun

object problema {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   def pascal(c: Int, r: Int): Int =
    if (r == 0 && c == 0) 1
    else if (r < 0 || c < 0) 0
    else pascal (r-1 , c) + pascal (r-1 , c-1)    //> pascal: (c: Int, r: Int)Int
    
    pascal (0,0)                                  //> res0: Int = 1
}
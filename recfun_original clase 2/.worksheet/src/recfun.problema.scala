package recfun

object problema {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(143); 
   def pascal(c: Int, r: Int): Int =
    if (r == 0 && c == 0) 1
    else if (r < 0 || c < 0) 0
    else pascal (r-1 , c) + pascal (r-1 , c-1);System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(22); val res$0 = 
    
    pascal (0,0);System.out.println("""res0: Int = """ + $show(res$0))}
}

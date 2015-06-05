package utils

object ProbarFraccion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); val res$0 = 
//  new Fraccion(1,3)
    2%3;System.out.println("""res0: Int(2) = """ + $show(res$0));$skip(43); 
    
   val list = List(1,2,4,2,4,7,3,2,4);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(13); val res$1 = 
   list.size;System.out.println("""res1: Int = """ + $show(res$1));$skip(22); 
   
   
   val e=123;System.out.println("""e  : Int = """ + $show(e ));$skip(30); 
   val l= e.toString().toList;System.out.println("""l  : List[Char] = """ + $show(l ))}
}
object NumberToChineseWords {

val digits = Map(0 -> "〇", 1 -> "壹", 2 -> "貳", 3 -> "參", 4 -> "肆", 5 -> "伍", 6 -> "陸", 7 -> "柒", 8 -> "捌", 9 -> "玖");
val exponent = Map(1 -> "", 10 -> "拾", 100 -> "佰", 1000 -> "仟", 10000 -> "萬", 100000 -> "億", 1000000 -> "兆");

  
 def chino (n: Int , e:Int) : String =
   if(n!=0){
     val ie = e*10
     val digito = (n % ie)
     val id = digito/e
     if (id >0)
     chino(n-digito, ie)+digits.get (id)+exponent.get(e)
   else
     chino(n-digito,ie)
   }else ""
  
  def format (unit:Int)=chino(unit,1)
  
  format(125)

}

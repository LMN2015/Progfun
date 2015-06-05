package utils

object NumberToChineseWords {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(163); 

val digits = Map(0 -> "〇", 1 -> "壹", 2 -> "貳", 3 -> "參", 4 -> "肆", 5 -> "伍", 6 -> "陸", 7 -> "柒", 8 -> "捌", 9 -> "玖");System.out.println("""digits  : scala.collection.immutable.Map[Int,String] = """ + $show(digits ));$skip(110); ;
val exponent = Map(1 -> "", 10 -> "拾", 100 -> "佰", 1000 -> "仟", 10000 -> "萬", 100000 -> "億", 1000000 -> "兆");System.out.println("""exponent  : scala.collection.immutable.Map[Int,String] = """ + $show(exponent ));$skip(242); ;

  
 def chino (n: Int , e:Int) : String =
   if(n!=0){
     val ie = e*10
     val digito = (n % ie)
     val id = digito/e
     if (id >0)
     chino(n-digito, ie)+digits.get (id)+exponent.get(e)
   else
     chino(n-digito,ie)
   }else "";System.out.println("""chino: (n: Int, e: Int)String""");$skip(41); 
  
  def format (unit:Int)=chino(unit,1);System.out.println("""format: (unit: Int)String""");$skip(17); val res$0 = 
  
  format(125);System.out.println("""res0: String = """ + $show(res$0))}

}

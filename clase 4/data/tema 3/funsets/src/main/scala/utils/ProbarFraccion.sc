package utils

object NumberToChineseWords {

val digits = Map(0 -> "〇", 1 -> "壹", 2 -> "貳", 3 -> "參", 4 -> "肆", 5 -> "伍", 6 -> "陸", 7 -> "柒", 8 -> "捌", 9 -> "玖");
                                                  //> digits  : scala.collection.immutable.Map[Int,String] = Map(0 -> ã€‡, 5 -> ä¼
                                                  //| �, 1 -> å£¹, 6 -> é™¸, 9 -> çŽ–, 2 -> è²³, 7 -> æŸ’, 3 -> å�ƒ, 8 -> æ�Œ, 4 -
                                                  //| > è‚†)
val exponent = Map(1 -> "", 10 -> "拾", 100 -> "佰", 1000 -> "仟", 10000 -> "萬", 100000 -> "億", 1000000 -> "兆");
                                                  //> exponent  : scala.collection.immutable.Map[Int,String] = Map(10 -> æ‹¾, 1 ->
                                                  //|  "", 100000 -> å„„, 10000 -> è�¬, 1000 -> ä»Ÿ, 1000000 -> å…†, 100 -> ä½°)

  
 def chino (n: Int , e:Int) : String =
   if(n!=0){
     val ie = e*10
     val digito = (n % ie)
     val id = digito/e
     if (id >0)
     chino(n-digito, ie)+digits.get (id)+exponent.get(e)
   else
     chino(n-digito,ie)
   }else ""                                       //> chino: (n: Int, e: Int)String
  
  def format (unit:Int)=chino(unit,1)             //> format: (unit: Int)String
  
  format(125)                                     //> res0: String = Some(å£¹)Some(ä½°)Some(è²³)Some(æ‹¾)Some(ä¼�)Some()

}
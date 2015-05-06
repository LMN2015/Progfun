package utils

object proeba {

trait Lista[T]
case class Vacia[T]() extends Lista[T]
case class Llena[T](val primero: Int, val resto: Lista[T]) extends Lista[T] {
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(257); 
 
def esVacio[T](e:Lista[T]) = e match {
case e:Vacia[T] => true
case e:Llena[T] => false
};System.out.println("""esVacio: [T](e: utils.proeba.Lista[T])Boolean""");$skip(117); 
  
def cantidad[T](xs:Lista[T]):Int = xs match {
case xs:Vacia[T] => 0
case xs:Llena[T] => 1 + cantidad(xs.resto)

};System.out.println("""cantidad: [T](xs: utils.proeba.Lista[T])Int""");$skip(61); 

val l = new Llena(1,new Llena(3, new Llena(4,new Vacia())));System.out.println("""l  : utils.proeba.Llena[Nothing] = """ + $show(l ));$skip(81); 
val j = new Llena('n',new Llena('e', new Llena('r',new Llena('y',new Vacia()))));System.out.println("""j  : utils.proeba.Llena[Nothing] = """ + $show(j ));$skip(12); val res$0 = 
cantidad(l);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 

cantidad(j);System.out.println("""res1: Int = """ + $show(res$1))}

      
}
      
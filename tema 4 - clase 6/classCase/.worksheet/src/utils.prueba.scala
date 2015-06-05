package utils

object prueba {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(69); 
  def contar2 (i:Int): Int =
  if (i==0) 0
  else (1+ contar2(i/10));System.out.println("""contar2: (i: Int)Int""");$skip(16); val res$0 = 
  contar2 (454);System.out.println("""res0: Int = """ + $show(res$0));$skip(64); 

def and (a: Boolean, b:Boolean): Boolean =
if (a) b
else false;System.out.println("""and: (a: Boolean, b: Boolean)Boolean""");$skip(39); 

def m (a: Int, b: => Int): Int =
	a*a;System.out.println("""m: (a: Int, b: => Int)Int""");$skip(10); val res$1 = 
	m(5,4+6);System.out.println("""res1: Int = """ + $show(res$1));$skip(40); 
	
val x = { println("se imprimo x"); 1};System.out.println("""x  : Int = """ + $show(x ));$skip(42); 
lazy val y = {println("se imprimo y"); 2};System.out.println("""y: => Int""");$skip(4); val res$2 = 
x+y;System.out.println("""res2: Int = """ + $show(res$2));$skip(32); 

def loop(g:Int): Int = loop(g);System.out.println("""loop: (g: Int)Int""");$skip(13); val res$3 = 
m(2,loop(1));System.out.println("""res3: Int = """ + $show(res$3));$skip(38); 
                        
   val t=777;System.out.println("""t  : Int = """ + $show(t ));$skip(58); 
                        
   val j = t.toString().tolist();System.out.println("""j  : <error> = """ + $show(j ))}
}

package utils

object prueba {
  println("Welcome to the Scala worksheet")
  def contar2 (i:Int): Int =
  if (i==0) 0
  else (1+ contar2(i/10))
  contar2 (454)

def and (a: Boolean, b:Boolean): Boolean =
if (a) b
else false

def m (a: Int, b: => Int): Int =
	a*a
	m(5,4+6)
	
val x = { println("se imprimo x"); 1}
lazy val y = {println("se imprimo y"); 2}
x+y

def loop(g:Int): Int = loop(g)
m(2,loop(1))
                        
   val t=777
                        
   val j = t.toString().tolist()
}
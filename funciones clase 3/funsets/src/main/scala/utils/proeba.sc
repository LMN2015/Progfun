package utils

object proeba {

trait Lista[T]
case class Vacia[T]() extends Lista[T]
case class Llena[T](val primero: Int, val resto: Lista[T]) extends Lista[T] {
}
 
def esVacio[T](e:Lista[T]) = e match {
case e:Vacia[T] => true
case e:Llena[T] => false
}                                                 //> esVacio: [T](e: utils.proeba.Lista[T])Boolean
  
def cantidad[T](xs:Lista[T]):Int = xs match {
case xs:Vacia[T] => 0
case xs:Llena[T] => 1 + cantidad(xs.resto)

}                                                 //> cantidad: [T](xs: utils.proeba.Lista[T])Int

val l = new Llena(1,new Llena(3, new Llena(4,new Vacia())))
                                                  //> l  : utils.proeba.Llena[Nothing] = Llena(1,Llena(3,Llena(4,Vacia())))
val j = new Llena('n',new Llena('e', new Llena('r',new Llena('y',new Vacia()))))
                                                  //> j  : utils.proeba.Llena[Nothing] = Llena(110,Llena(101,Llena(114,Llena(121,V
                                                  //| acia()))))
cantidad(l)                                       //> res0: Int = 3

cantidad(j)                                       //> res1: Int = 4

      
}
      
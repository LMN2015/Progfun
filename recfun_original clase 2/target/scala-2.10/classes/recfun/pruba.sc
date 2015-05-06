package recfun

object pruba {
  val lista = List('a','b','c')                   //> lista  : List[Char] = List(a, b, c)
  lista.head                                      //> res0: Char = a
  lista.tail                                      //> res1: List[Char] = List(b, c)
  'a'::'b'::'c'::List()                           //> res2: List[Char] = List(a, b, c)
}
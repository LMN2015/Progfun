package utils

import common._

/**
 * Libreria de funciones para Listas de enteros
 */
object ListIntUtils {
  
  /**
   * Buscar 
   * Dada una lista y una función de comparación, devuelve el valor que cumple la condición. 
   */
  def buscar(lista: List[Int], com:(Int, Int) => Boolean): Int = 
    
    if (lista.tail.isEmpty) lista.head
      else if (com(lista.head, buscar(lista.tail, com))) lista.head
          else buscar(lista.tail, com)
  /*
   * Busca el Maximo
   */
    
  def max(lista: List[Int]) : Int = buscar(lista, (a:Int, b:Int) => (a > b) )
    
  
  /*
   * Busca el minimo
   */
  def min(lista: List[Int]) : Int = buscar(lista, (a:Int, b:Int) =>(a < b) )
  
  
  
  
  
  /*
   * Busca la mediana
   * En el ámbito de la estadística, la mediana representa el 
   * valor de la variable de posición central en un conjunto de datos ordenados.
   */

  
    /*
 *(filtrar los mayores y los menores y despues hacer el Quitsort si es vacio devolver esa lista  ++ la lista del primero con los mayores)
 * QS (filtrar menor(l.tail)++l.head::QS(filtrar mayor(l.tail)))
 *
*/

  /**
   * Cuenta los elementos
   */

  
  def contar(lista: List[Int]) : Int = 
   if (lista.isEmpty) 0
     else (1 + contar(lista.tail))
     
 // def withoutmaxandmin(lista: List[Int]): List[Int]= ???
 

     //mediana=sort y mediana2=mediana
     
  def qs(lista: List[Int]) : List[Int] =
    if ((lista.isEmpty) || (lista.tail.isEmpty)) lista
    else qs(minimo(lista.tail,lista.head)++(lista.head::maximo(lista.tail,lista.head)))
     
    
  def mediana(lista: List[Int]) : Int =
  if (lista.isEmpty) 0
  else if (par(contar(lista))) ((contar(qs(lista))/2+1)+(contar(qs(lista))/2))/2
        else (contar(qs(lista))/2+1)
    
  
  
  /**
   * 
   */
   
  /**
   * Sumar elementos de adentro de la lista con pliegue   
   */
     
  def sumar2(lista2: List[Int]) : Int =
    lista2.foldLeft(0)((sum, x) => sum + 1)
    
   /**
   * Contar elementos de adentro de la lista con pliegue   
   */
  
  def contar2(lista: List [Int]) : Int =
   lista.foldLeft(0) ((acc,x) => acc + 1)
   
   /**
   * Contar los pares
   */
   
   def conpar(lista: List [Int]) : Int =
   lista.foldLeft(0)((acc , x) => if (x % 2==0) acc + 1 
   else acc)
   
  /**
   * Filtra los elementos de la lista xs segun la funcion p
   */
  def filtrar(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p (xs.head)) xs.head::filtrar(xs.tail, p)
    else filtrar(xs.tail, p)
  
    /**
     *Minimo y maximo 
     */
        
    def minimo(l: List[Int], p: Int) : List[Int] =
      filtrar(l, (otro:Int) => (p<otro)  ) 
    
       
    def maximo(l: List[Int], p: Int) : List[Int] =
      filtrar(l, (otro:Int) => (p>otro)  ) 
     
  /**
   * Filtra los elementos pares
   */
    
  /**
   * Es par? :?  
   */
    def par(numero : Int) : Boolean =
      (numero % 2 == 0)
/**
   * Es multiplo de 3? :? 
   */
   def mul(numero : Int) : Boolean =
     (numero % 3 == 0)
   
 
      
  def filtrarPares(xs: List[Int]): List[Int] = 
   filtrar(xs, par)
  
  /**
   * Filtra los elementos multiplos de 3
   */
  def filtrarMultiplosDeTres(xs: List[Int]): List[Int] =
  filtrar (xs, mul)
  
   /**
   * Acumula los elementos aplicandoles fx
   */  
  def acumular(lista: List[Int])(fx: (Int) => Int): Int =
  if (lista.isEmpty) 0
  else (lista.foldLeft(0)((sum, x) => sum + fx(x))) 
  
  /**
   * Acumula todos los elementos de una lista
   */
  
  def uni(i:Int) =i
   
  def acumularUnidad(lista: List[Int]): Int = acumular(lista)(uni)
  
  /**
   * Acumula  el dobles de los elementos de una lista
   */
  def unido(i:Int)= i*2
  
  def acumularDoble(lista: List[Int]): Int = acumular(lista)(unido)
  
  /**
   * Acumula el cuadrado de los elementos de una lista
   */
  def unicua(i:Int)=i*i
  def acumularCuadrado(lista: List[Int]): Int = acumular(lista)(unicua)
  
}

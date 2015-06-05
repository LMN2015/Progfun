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
  def buscar(lista: List[Int], com:(Int, Int) => Boolean): Int = ???
  
  /*
   * Busca el Maximo
   */
  def max(lista: List[Int]) : Int = ???
  
  /*
   * Busca el minimo
   */
  def min(lista: List[Int]) : Int = ???
  
  /*
   * Busca la mediana
   * En el ámbito de la estadística, la mediana representa el 
   * valor de la variable de posición central en un conjunto de datos ordenados.
   */
  def mediana(lista: List[Int]) : Int = ???
  
  /**
   * Cuenta los elementos
   */
  def contar(lista: List[Int]) : Int = ???
  
  /**
   * Filtra los elementos de la lista xs segun la funcion p
   */
  def filtrar(xs: List[Int], p: Int => Boolean): List[Int] = ???
  
  /**
   * Filtra los elementos pares
   */
  def filtrarPares(xs: List[Int]): List[Int] = ???
  
  /**
   * Filtra los elementos multiplos de 3
   */
  def filtrarMultiplosDeTres(xs: List[Int]): List[Int] = ???
  
   /**
   * Acumula los elementos aplicandoles fx
   */
  def acumular(lista: List[Int])(fx: (Int) => Int): Int = ???
  
  /**
   * Acumula todos los elementos de una lista
   */
  def acumularUnidad(lista: List[Int]): Int = ???
  
  /**
   * Acumula  el dobles de los elementos de una lista
   */
  def acumularDoble(lista: List[Int]): Int = ???
  
  /**
   * Acumula el cuadrado de los elementos de una lista
   */
  def acumularCuadrado(lista: List[Int]): Int = ???
  
}

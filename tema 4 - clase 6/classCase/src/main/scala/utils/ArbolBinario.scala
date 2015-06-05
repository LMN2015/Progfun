package utils

import common._

/**
 *  Arbol Binario
 *
 */
object ArbolBinario {

  /**
   * Un árbol binario de búsqueda también llamados BST (acrónimo del inglés Binary Search Tree)
   * es un tipo particular de árbol binario que presenta una estructura de datos en forma de árbol
   * usada en informática.
   *
   * Árbol binario
   *
   * la mayoría de los árboles binarios son de búsqueda
   *
   * Un árbol binario no vacío, de raíz R, es un árbol binario de búsqueda si:
   *
   * En caso de tener subárbol izquierdo, la raíz R debe ser mayor que el valor máximo almacenado en el
   * subárbol izquierdo, y que el subárbol izquierdo sea un árbol binario de búsqueda.
   * En caso de tener subárbol derecho, la raíz R debe ser menor que el valor mínimo almacenado en el
   * subárbol derecho, y que el subárbol derecho sea un árbol binario de búsqueda.
   *
   * En Resumen: Un elemento apunta a otros dos elementos, uno esta a la izquierda y otro a la derecha.
   * El elemento a la izquierda es más pequeño y el segundo es más grande.
   * Cada uno de estos dos elementos puede apuntar a otros dos elementos (o a uno o a ninguno).
   * En efecto, cada elemento tienen sus propios sub-árboles. Lo bueno de los árboles binarios
   * de búsqueda es que sabemos que todos los elementos que están en el sub-árbol de la izquierda
   * de, 5, por ejemplo, son menores que 5. Lo elementos que están en el sub-árbol de la derecha
   * son mayores. Así que si estamos buscando el elemento 8 en nuestro árbol, empezamos comparándolo
   * con 5, como vemos que es menor que 5, nos vamos al sub-árbol de la derecha. Ahora estaríamos en 7,
   * como es menor que 8 continuaríamos hacia la derecha. De esta forma encontraríamos el elemento en
   * tres pasos. Si estuviéramos usando una lista (o un árbol no balanceado), nos hubiera costado unos 7
   * pasos encontrar el 8.
   *
   */

  abstract class Tree
  case class EmptyTree() extends Tree
  case class Node(nro: Int, left: Tree, rigth: Tree) extends Tree

  /**
   * Inserta un elemento
   */
  def insert(nro: Int, tree: Tree): Tree =
  tree match{
  case EmptyTree() => new Node(nro,new EmptyTree(),new EmptyTree())
  case Node(nro2,left,right) => if (nro2==nro) tree
  else if (nro2<nro) new Node(nro,insert(nro, left),right)
  else new Node(nro,left,insert(nro, right)) 
  }
  /**
   * Devuelve verdadero si el elemento esta en el arbol.
   */
  def elem(nro: Int, tree: Tree): Boolean =
    tree match{
  case EmptyTree() => false
  case Node(nro2,left,right) => if (nro2==nro) true
  else if (nro2<nro) elem(nro,left) 
  else elem(nro,right)
  }
  
  /**
   * Devuelve la cantidad de nodos del arbol
   */
  def countNodes(tree: Tree): Int = 
tree match{
    case EmptyTree() => 0
    case Node(nro2,left,right) => countNodes(left)+countNodes(right) +1
  }
  
  
  /**
   * Devuelve un arbol donde se aplico esta funcion
   */
  def apply(tree: Tree, fx: (Int) => Int): Tree = 
  tree match{
    case EmptyTree() => tree
    case Node (nro2,left,right) => new Node(fx(nro2),apply(left,fx),apply(right,fx))
  }
  /**
   * Devuelve un arbol con el doble de los elementos
   */
  
  def unido(i:Int)= i*2
  def double(tree: Tree): Tree = apply(tree, unido)
  
  /**
   * Devuelve una lista ordenada
   */
  
     
  def toList(tree: Tree): List[Int] = 
    tree match {
      case EmptyTree() => List()
      case Node(nro2,left,right)=> toList(left)++List(nro2)++toList(right)
    }
    
    /**
   * Devuelve una lista ordenada
   */
  def toString(tree: Tree): String = 
    tree match{
    case EmptyTree() => ""
    case Node(nro2,left,right) => left.toString()++nro2.toString()++right.toString()
    
  }
  
  
}

object NumberToChineseWords {

val digits = Map(0 -> "〇", 1 -> "壹", 2 -> "貳", 3 -> "參", 4 -> "肆", 5 -> "伍", 6 -> "陸", 7 -> "柒", 8 -> "捌", 9 -> "玖");
val exponent = Map(1 -> "", 10 -> "拾", 100 -> "佰", 1000 -> "仟", 10000 -> "萬", 100000 -> "億", 1000000 -> "兆");


  def format (unit:Int)=chino(unit,1)
  
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
 
}

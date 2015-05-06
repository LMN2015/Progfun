package utils

object proeba {
import utils.ListIntUtils._
  List(1,2,3,4).foldLeft(0)((sum, x) => sum + x)  //> res0: Int = 10
  List(1,2,3,4).foldLeft(0) ((acc,x) => acc +1)   //> res1: Int = 4
  
   List(1,2,3,4).foldLeft(0)((acc , x) => if (x % 2==0) acc +1 else acc)
                                                  //> res2: Int = 2
   val lista = List(1,2,3,4)                      //> lista  : List[Int] = List(1, 2, 3, 4)
      if (7 % 2 == 0) true
      else false                                  //> res3: Boolean = false
      
      (6 % 3 == 0)                                //> res4: Boolean = true
      
          if (List(1,2,3,4).isEmpty) 0
  else (List(1,2,3,4).foldLeft(0)((sum, x) => sum + x))
                                                  //> res5: Int = 10
       2                                          //> res6: Int(2) = 2
      acumular(lista)((i:Int)=> i)                //> java.lang.NoClassDefFoundError: utils/ListIntUtils$
                                                  //| 	at utils.proeba$$anonfun$main$1.apply$mcV$sp(utils.proeba.scala:18)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at utils.proeba$.main(utils.proeba.scala:4)
                                                  //| 	at utils.proeba.main(utils.proeba.scala)
                                                  //| Caused by: java.lang.ClassNotFoundException: utils.ListIntUtils$
                                                  //| 	at java.net.URLClassLoader$1.run(Unknown Source)
                                                  //| 	at java.net.URLClassLoader$1.run(Unknown Source)
                                                  //| 	at java.security.AccessController.doPrivileged(Native Method)
                                                  //| 	at java.net.URLClassLoader.findClass(Unknown Source)
                                                  //| 	at java.lang.ClassLoader.loadClass(Unknown Source)
                                                  //| 	at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Sou
                                                  //| Output exceeds cutoff limit.
      }
      
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception2;

/**
 *
 * @author andad
 */

//in file Test.java
class E1 extends Exception{ }
class E2 extends E1 { }
class CustomException2 {
   public static void main(String[] args){
      try{
         throw new E2();// subclass of E1
      }
      catch(E1 e){
         System.out.println("E1");
      }
      catch(Exception e){
         System.out.println("E");
      }
      finally{
         System.out.println("Finally");
      }
   }
}


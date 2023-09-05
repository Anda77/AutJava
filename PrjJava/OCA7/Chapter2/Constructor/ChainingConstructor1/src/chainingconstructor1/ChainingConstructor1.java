/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainingconstructor1;

/**
 *
 * @author andad
 */


class ChainingConstructor1 extends A{
   int i =   4;
   
   public static void main(String[] args)
   {
      A a = new ChainingConstructor1();
      a.print();
   }
   void print() { System.out.println(i); }
}


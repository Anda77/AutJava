/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super4;

/**
 *
 * @author andad
 */
class Super4{
   int i;
   public Super4(int x) { this.i = x; }
}
class B extends Super4{
   int j;
   public B(int x, int y) { super(x);  this.j = y; }
   
   public B(int x)
   {
       super(x*2);
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock8;

/**
 *
 * @author andad
 */
public class Staticblock8 {

    /**
     * @param args the command line arguments
     */
    static String s1 = sM1("a");{
      s1 = sM1("b");
   }
   static{
      s1 = sM1("c");
   }
   
   private static String sM1(String s){
      System.out.println(s);  return s;
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Staticblock8 sb8 = new Staticblock8();
    }
    
}

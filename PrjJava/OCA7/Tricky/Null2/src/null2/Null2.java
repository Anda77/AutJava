/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package null2;

/**
 *
 * @author andad
 */
public class Null2 {

    /**
     * @param args the command line arguments
     */
    public void method(Object o){
      System.out.println("Object Version");
   }
   public void method(java.io.FileNotFoundException s){
      System.out.println("java.io.FileNotFoundException Version");
   }
   public void method(java.io.IOException s){
      System.out.println("IOException Version");
   }
    public static void main(String[] args) {
       
         Null2 tc = new Null2();
         tc.method(null);
    }
    
}

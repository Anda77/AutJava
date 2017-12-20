/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmeticexception2;

/**
 *
 * @author andad
 */
public class AritmeticException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int k = 0;
      try{
         int i = 5/k;
      }
      catch (ArithmeticException e){
         System.out.println("1");
      }
      catch (RuntimeException e){
         System.out.println("2");
         return ;
      }
      catch (Exception e){
         System.out.println("3");
      }
      finally{
         System.out.println("4");
      }
      System.out.println("5");
    }
    
}

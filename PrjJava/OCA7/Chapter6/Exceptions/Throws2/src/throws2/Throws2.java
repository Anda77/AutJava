/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws2;

/**
 *
 * @author andad
 */
class NewException extends Exception {}
class AnotherException extends Exception {}
public class Throws2 {

    /**
     * @param args the command line arguments
     */
 

   public static void main(String [] args) throws Exception{
      try{
         m2();
      }
      finally{ m3(); }
    }
    public static void m2() throws NewException{  throw new NewException();  }
    public static void m3() throws AnotherException{  throw new AnotherException();  }
}
    

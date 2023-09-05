/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocklabeled;

/**
 *
 * @author andad
 */
public class Blocklabeled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int i = 0;
      loop :         // 1
      {
         System.out.println("Loop Lable line");
         try{
            for (  ;  true ;  i++ ){
               if( i >5) break loop;       // 2
            }
         }
         catch(Exception e){
            System.out.println("Exception in loop.");
         }
         finally{
            System.out.println("In Finally");      // 3
         }
         
    }
    
}
}

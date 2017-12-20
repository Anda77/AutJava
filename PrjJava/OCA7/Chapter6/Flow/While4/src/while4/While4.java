/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while4;

/**
 *
 * @author andad
 */
public class While4 {

    /**
     * @param args the command line arguments
     */
       public int luckyNumber(int seed){
       if(seed > 10) return seed%10;
       int x = 0;
       try{
           if(seed%2 == 0) throw new Exception("No Even no.");
           else return x;
       }
       catch(Exception e){
           return 3;
       }
       finally{
           return 7;
       }
   }
       
    public static void main(String[] args) {
        // TODO code application logic here
        int amount = 100, seed = 6;
      switch( new While4().luckyNumber(6) ){
            case 3: amount = amount * 2;
            case 7: amount = amount * 2;
            case 6: amount = amount + amount;
            default :
      }
      System.out.println(amount);
    }
    
}

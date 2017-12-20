/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this3;

/**
 *
 * @author andad
 */
public class This3 {

    /**
     * @param args the command line arguments
     */
      private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue;
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        This3 ct = new This3();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }
    
}

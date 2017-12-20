/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring2;

/**
 *
 * @author andad
 */
public class ToString2 {

    /**
     * @param args the command line arguments
     */
    static int si = 10;
    public static void main(String[] args) {
        // TODO code application logic here
        ToString2 ts = new ToString2();
    }
    
    
   public ToString2(){ 
            System.out.println(this);}
    public String toString(){
           return "TestClass.si = "+this.si;}
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloaded3;

/**
 *
 * @author andad
 */
public class Overloaded3 {

    /**
     * @param args the command line arguments
     */
      public void m(int a){
              System.out.println("In int ");}
      public void m(char c){ 
              System.out.println("In char ");}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Overloaded3 ov3 = new Overloaded3();
        int a = 'a';
        char c = 6;
        ov3.m(a);
        ov3.m(c);
        
        
    }
    
}

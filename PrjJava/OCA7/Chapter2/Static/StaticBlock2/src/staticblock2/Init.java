/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock2;

/**
 *
 * @author anda
 */
public class Init {

    public Init() {
        System.out.println("no-args construtor");
        
    }
     public Init(int x) {
        System.out.println("1-args construtor");
        
    }
     static { System.out.println("2nd static init");}
     
     static { System.out.println("1nd static init");}
     {
        System.out.println("1nd instance init"); 
        System.out.println("2nd instance init");
     }
    
    
}

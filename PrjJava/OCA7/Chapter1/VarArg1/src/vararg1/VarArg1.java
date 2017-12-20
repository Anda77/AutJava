/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vararg1;

/**
 *
 * @author andad
 */
public class VarArg1 {

    /**
     * @param args the command line arguments
     */
    
    public void stringProcessor(String... names)
    { for (String n : names) 
    { 
    System.out.println("Hello " + n);
    } 
    }
            
            
    public static void main(String[] args) {
        // TODO code application logic here
        new VarArg1().stringProcessor("Anda", "Adrian");
        new VarArg1().stringProcessor("Anda", "Adrian", "Alina");
    }
    
}

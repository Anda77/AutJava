/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsamenameconstructor;

/**
 *
 * @author andad
 */
public class MethodsamenameConstructor {

    /**
     * @param args the command line arguments
     */
    long l;
    public void MethodsamenameConstructor(long l)
    {
        l = 6;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        MethodsamenameConstructor a, b;
        a = new MethodsamenameConstructor();
       //b = MethodsamenameConstructor((long)5);
        
    }
    
}

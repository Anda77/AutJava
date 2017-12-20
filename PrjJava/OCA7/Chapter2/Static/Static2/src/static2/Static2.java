/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static2;

/**
 *
 * @author anda
 */
public class Static2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal [] a = {new Animal(), new Dog(), new Animal()};
        for(int x = 0; x<a.length; x++)
        {
            a[x].doStuff();
            // type conteaza
        }
        Dog.doStuff();
    }
    
}

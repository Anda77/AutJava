/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface5;

/**
 *
 * @author andad
 */
public class Interface5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        print(new FancyCar()); 
    }
    private static void print(Car car)
    {
        //((Breakable)car).breakSmmothly();
        //((SuperFancyCar)car).turn();
        ((SuperFancyCar)car).breakSmmothly();
        car.accelerate();
        ((FancyCar)car).breakSmmothly();
        ((FancyCar)car).accelerate();
        
    }
    
}

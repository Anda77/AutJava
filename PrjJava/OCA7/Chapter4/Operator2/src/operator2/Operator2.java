/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator2;

/**
 *
 * @author anda
 */
public class Operator2 {

    /**
     * @param args the command line arguments
     */
    // daca apare o exceptie si nu este prinsa programul se termina
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length == 1  | args[1].equals("test"))
        {
            System.out.println("test case");
        } else
        {
            System.out.println("production " + args[0]);
        }
    }
    
}

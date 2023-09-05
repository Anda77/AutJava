/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise6.pkg2;

/**
 *
 * @author andad
 */
public class Excersise62 {

    /**
     * @param args the command line arguments
     */
    private int a = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 0;
        label1:
        while (age <= 21) {
            age += 1;
            if (age >= 16) {
                System.out.println("get your driver's licence");
                continue label1;
            } else {
                System.out.println("another year");
            }

        }
        

    }
}

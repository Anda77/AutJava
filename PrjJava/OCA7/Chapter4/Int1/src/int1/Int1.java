/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int1;

/**
 *
 * @author andad
 */
public class Int1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value = 1000000; //1
        switch (value) {
            case 1_000_000:
                System.out.println("A million 1"); //2
                break;
            case 1000001:
                System.out.println("A million 2"); //3                 
                break;
        }

    }
}

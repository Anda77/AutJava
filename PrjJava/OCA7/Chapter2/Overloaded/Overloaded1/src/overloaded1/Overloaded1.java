/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloaded1;

/**
 *
 * @author andad
 */
class Super {

    public int getNumber(int a) {
        return 2;
    }
}

public class Overloaded1 extends Super {

    /**
     * @param args the command line arguments
     */
    public int getNumber(int a, char ch) {
        return 4;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( new Overloaded1().getNumber(4) );
    }

}

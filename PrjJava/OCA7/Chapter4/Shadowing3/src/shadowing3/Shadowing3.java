/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowing3;

/**
 *
 * @author andad
 */
class ABCD {

    int x = 10;
    static int y = 20;
}

class MNOP extends ABCD {

    int x = 30;
    static int y = 40;
}

public class Shadowing3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new MNOP().x + ", " + new MNOP().y);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws3;

/**
 *
 * @author andad
 */
class XXX {

    public void m() throws Exception {
        throw new Exception();
    }
}

class YYY extends XXX {

    public void m() {
    }
}

public class Throws3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        YYY obj = new YYY(); 
        obj.m();
    }

}

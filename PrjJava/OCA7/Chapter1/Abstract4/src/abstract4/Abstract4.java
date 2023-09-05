/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract4;

import java.util.logging.Logger;

/**
 *
 * @author andad
 */
public abstract class Abstract4 {

    /**
     * @param args the command line arguments
     */
    abstract void calculate();
    private static final Logger LOG = Logger.getLogger(Abstract4.class.getName());

    public Abstract4() {
    }

    public static void main(String[] args) {
        System.out.println("calculating");
        Abstract4 x = null;
        x.calculate();

    }
}

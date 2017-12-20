/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalinitialization;

/**
 *
 * @author andad
 */
enum Shade {
    LIGHT, DARK
};

public class FinalInitialization {

    /**
     * @param args the command line arguments
     */
    final int shade;

    public FinalInitialization(Shade val) {
        switch (val) {
            case LIGHT:
                shade = 11;
                break;
            case DARK:
                shade = 22;
                break;
            default:
                shade = 33;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

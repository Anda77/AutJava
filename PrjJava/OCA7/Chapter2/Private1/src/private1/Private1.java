/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package private1;

/**
 *
 * @author andad
 */
public class Private1 extends Rocket{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Private1().go();
    }
    
    void go()
    {
        blastOff();
    }
    private void blastOff()
    {
        System.out.print("sh-bang");
    }
    
}

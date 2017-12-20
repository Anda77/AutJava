/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override3;

/**
 *
 * @author andad
 */
class Game {

    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

public class Override3 extends Game {

    /**
     * @param args the command line arguments
     */
    public void play() {
        System.out.println("Playing Soccer...");
    }

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Game g = new Override3();
        g.play();
    }

}

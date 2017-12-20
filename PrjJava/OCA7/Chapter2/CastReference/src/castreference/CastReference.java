/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castreference;

/**
 *
 * @author andad
 */
class GoodSpeak extends CastReference implements Tone {

    public void up() {
        System.out.println("UP UP UP");
    }
}

interface Tone {

    void up();
}

public class CastReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s1 = 9;
        CastReference s = new GoodSpeak();
        ((Tone) s).up();
        ((GoodSpeak) s).up();
        Integer i = 9; System.out.println( s1 == i );
    }

}

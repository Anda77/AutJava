/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbyvalue;

/**
 *
 * @author andad
 */
class Wrapper {

    int w = 10;
}

public class CallByValue {

    /**
     * @param args the command line arguments
     */
    static Wrapper changeWrapper(Wrapper w) {
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w);
        w = changeWrapper(w);
        System.out.println(w.w);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forinfor;

/**
 *
 * @author andad
 */
public class ForInFor {

    /**
     * @param args the command line arguments
     */
    public void loopTest(int x) {
        loop:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("i= " + i);
                if (x == 0) {
                    continue loop;
                }
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(args[0]);
        ForInFor ff = new ForInFor();
        ff.loopTest(0);
    }

}

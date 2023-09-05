/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

/**
 *
 * @author anda
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    final static int x2 = 7;
    final static Integer x4 = 8;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer x1 = 5;
        String s = "a";
        if (x1<9) s +="b";
        switch(x1)
        {
            case 5: s +="c";
            case x2 : s +="d";
            //case x4: s +="e"; // error compilier : constant expresiion required
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding4;

/**
 *
 * @author andad
 */
public class Overriding4 extends Utils {

    /**
     * @param args the command line arguments
     */
    int getInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Utils u = new Overriding4();
        System.out.println(u.getInt(args[0]));
        
    }

}

class Utils {

    int getInt(String s) throws Exception {
        return 7;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor2;

/**
 *
 * @author anda
 */
public class Horeos {
    static String s = "-";

    public Horeos() {
        s +="hi";
        //this(1); // call to this must be first 
    }
    
    Horeos(int x)
    {
        s +="s2";
    }
    
    
}

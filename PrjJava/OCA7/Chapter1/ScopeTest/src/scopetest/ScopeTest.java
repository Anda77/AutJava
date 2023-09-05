/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopetest;

/**
 *
 * @author andad
 */
public class ScopeTest {

    /**
     * @param args the command line arguments
     */
    static int x = 5;

    public static void main(String[] args) {
        // TODO code application logic here
        int x = ( x = 3 ) * 4;
        System.out.println(x);
    }

}

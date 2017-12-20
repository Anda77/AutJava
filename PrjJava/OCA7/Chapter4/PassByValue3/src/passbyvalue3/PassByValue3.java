/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyvalue3;

/**
 *
 * @author andad
 */
public class PassByValue3 {

    /**
     * @param args the command line arguments
     */
    int value = 1;
    PassByValue3 link;

    public PassByValue3(int val) {
        this.value = val;
    }

    public static PassByValue3 setIt(final PassByValue3 x, final PassByValue3 y) {
        x.link = y.link;
        return x;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

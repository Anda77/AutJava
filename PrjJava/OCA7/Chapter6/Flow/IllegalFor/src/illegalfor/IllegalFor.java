/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package illegalfor;

/**
 *
 * @author andad
 */
public class IllegalFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        for(i=4, j = 6;i<0;i++);
        //for(i=4, int j = 6;i<0;i++);    illegal, compiler error
    }
    
}

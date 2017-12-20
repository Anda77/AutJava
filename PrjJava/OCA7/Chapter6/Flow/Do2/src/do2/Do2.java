/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do2;

/**
 *
 * @author andad
 */
public class Do2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        int j = 3;
        do{
            System.out.println("i= " + i + " j= " + j);
        } while (i++==5 || ++j==3);
    }
    
}

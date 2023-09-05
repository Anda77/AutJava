/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question33;

/**
 *
 * @author anda
 */
public class Question33 {

    /**
     * @param args the command line arguments
     */
    enum Month { JAN, FEB, MAR }
    public static void main(String[] args) {
    
        Month m1 = Month.JAN;
        Month m2 = Month.JAN;
        Month m3 = Month.FEB;
        System.out.println(m1==m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1==m3);
        System.out.println(m1.equals(m3));
        
    }
    
}

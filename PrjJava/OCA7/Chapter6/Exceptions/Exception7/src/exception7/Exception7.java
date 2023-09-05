/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception7;



/**
 *
 * @author anda
 */
public class Exception7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // how to catch illegalargumentexception
        Percentage percentage = new Percentage(121);
        System.out.println(percentage.getValue());
    }
    
}

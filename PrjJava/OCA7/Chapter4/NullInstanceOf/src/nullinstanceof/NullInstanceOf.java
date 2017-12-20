/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullinstanceof;

/**
 *
 * @author anda
 */
public class NullInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = null;
        if (str instanceof Object) // NULLCHEK
        {
            System.out.println("str is Object");
        } else {
            System.out.println("str is not Object");
        }

    }

}

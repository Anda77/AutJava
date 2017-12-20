/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question16;

import java.io.IOException;

/**
 *
 * @author anda
 */
public class Question16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        SuperClass sb = new SubClass();
        sb.doIt("Hello", 3);
    }
    
}

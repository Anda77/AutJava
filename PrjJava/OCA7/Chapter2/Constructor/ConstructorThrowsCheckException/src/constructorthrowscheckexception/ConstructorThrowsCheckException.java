/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorthrowscheckexception;

import java.io.IOException;

/**
 *
 * @author andad
 */
public class ConstructorThrowsCheckException {

    /**
     * @param args the command line arguments
     */
    public ConstructorThrowsCheckException(int port) throws IOException{
        if (Math.random() > 0.5) {
            throw new IOException();
        }

        throw new RuntimeException();
    }
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        try {
            ConstructorThrowsCheckException pc = new ConstructorThrowsCheckException(10);
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
    
}

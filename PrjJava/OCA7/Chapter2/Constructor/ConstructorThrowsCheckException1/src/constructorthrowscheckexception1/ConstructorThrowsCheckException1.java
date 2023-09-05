/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorthrowscheckexception1;

import java.io.IOException;

/**
 *
 * @author andad
 */
public class ConstructorThrowsCheckException1 {

    /**
     * @param args the command line arguments
     */
     public ConstructorThrowsCheckException1(int port) throws Exception{
        if (Math.random() > 0.5) {
            throw new IOException();
        }

        throw new RuntimeException();
    }
     
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    }
    
}

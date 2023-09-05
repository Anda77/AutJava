/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throw1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author andad
 */
public class Throw1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       // TODO code application logic here
       try{
       InputStream i = new FileInputStream("in.txt");
        System.out.println("File to open");
        int c = i.read();
       }
        catch(Exception ex)
                {
                ex.printStackTrace();
                throw ex;
                }
    }

}

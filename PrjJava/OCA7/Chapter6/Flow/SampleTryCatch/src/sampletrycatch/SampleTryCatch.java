/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampletrycatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author anda
 */
public class SampleTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            System.out.println("About to open a file");
            
            InputStream in = new FileInputStream("missing.txt");
            System.out.println("File open");
            
            
        }
        catch(IOException ex)
        {
            System.out.println("Something goes wrong: File not found");
        }
        
    }
    
}

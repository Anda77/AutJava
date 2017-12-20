/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strequal;

/**
 *
 * @author anda
 */
public class StrEqual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "hi";
        String s2 = new String("hi");
        String s3 = "hi";
        
        if (s1==s2)
        {
            System.out.println("s1 and s2 are equal");
        }
        else
        {
            System.out.println("s1 and s2 are not equal");
                
        }
        if (s1==s3)
        {
           System.out.println("s1 and s3 are literal constants"); 
        }
        String x = "test";
        System.out.println(x.length());
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main6;

/**
 *
 * @author andad
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    private static void main()
    {
        System.out.println("EjavaGuru");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        main();
        main(args);
        }
        catch(Exception ex)
        {
            new Exception().printStackTrace();
        }
    }
    
}

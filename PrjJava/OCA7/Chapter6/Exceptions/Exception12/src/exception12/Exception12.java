/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception12;

/**
 *
 * @author anda
 */
public class Exception12 extends Utils{

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
    //public static void main(String[] args) throws Exception{
        // TODO code application logic here
        try 
        {
        Utils u = new Exception12();
        System.out.println(u.getInt(args[0]));
        }
        catch(Exception e)
        {
            
        }
    }
    
    int getInt(String x) 
    {
        return Integer.parseInt(x);
    }
    
}

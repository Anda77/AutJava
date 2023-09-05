/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception10;

/**
 *
 * @author anda
 */
public class Slave extends Master{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       String s = null;
        try
        {
            s = new Slave().doStuff();
                    
        }
        catch(Exception ex)
        {
            s ="'b";
        }
        System.out.println(s);
    }
    
    //public String doStuff()
    //{
      //  return "b";
    //}
    
   /**
    public String doStuff() throws NumberFormatException
    {
        return "b";
    }
    * */
    
    /**  
    public String doStuff() throws FileNotFoundException
    {
        return "b";
    }
    * **/
    /*
    public String doStuff() throws FileNotFoundException, NumberFormatException
    {
        return "b";
    }
    */
     
    public String doStuff() throws StackOverflowError
    {
        return "b";
    }
    
  
    
    
}

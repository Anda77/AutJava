/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferexception;

/**
 *
 * @author andad
 */
public class TransferException extends Utils{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Utils u = new TransferException();
        System.out.println(u.getInt(args[0]));
    }
    
    int getInt(String s)
    {
        return Integer.parseInt(s);
    }
    
    
}

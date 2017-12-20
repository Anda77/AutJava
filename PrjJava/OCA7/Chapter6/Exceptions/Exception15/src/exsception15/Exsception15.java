/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsception15;

/**
 *
 * @author anda
 */
public class Exsception15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            new Exsception15().go();
        }
        catch(VirtualMachineError e)
        {
            System.out.println("ouch");
        }
    }
    
    void go()
    {
        go();
    }
    
}

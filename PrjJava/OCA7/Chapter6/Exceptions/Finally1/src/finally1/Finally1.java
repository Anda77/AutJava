/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finally1;

/**
 *
 * @author andad
 */
public class Finally1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        int x = 34;
        int y = x/0;
        }
        catch(Exception ex)
        {
            System.exit(0);
        }
        finally
                {
                    System.out.println("Oare se mai executa?");
                }
    }
    
}

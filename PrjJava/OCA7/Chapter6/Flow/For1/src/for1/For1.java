/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for1;

/**
 *
 * @author anda
 */
public class For1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int j = 0;
        for(i = 0; i<5; i++)
        {
            if (i==2) continue;
            j++;
        }
        System.out.println("i= " + i + "j= " + j);
        
    }
    
}

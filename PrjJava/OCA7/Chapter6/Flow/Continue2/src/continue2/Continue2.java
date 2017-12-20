/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continue2;

/**
 *
 * @author andad
 */
public class Continue2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[] {4,3,2,1};
        int total = 0;
        for(int x: a)
        {
            if (x==a.length)
             continue;
            total +=x;
                
        }
        System.out.println(total);
        
    }
    
}

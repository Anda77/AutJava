/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayindexoutvoundsexception1;

/**
 *
 * @author andad
 */
public class ArrayindexoutvoundsException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1, 2, 3, 4,5 ,6};
        int i = a.length;
        
        while(i>=1)
        {
            System.out.println(a[i]);
            i--;
        }
    }
    
}

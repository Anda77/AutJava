/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcarenuseexecuta;

/**
 *
 * @author andad
 */
public class ForCareNuSeExecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        // 0>20 este false
        Boolean f = true;
        for (byte i = 0; i<20; ++i)
        {
            System.out.println(i);
            i++;
            System.out.println(i);
        }
            
        for (int i = 0, j = 10; sum > 20; ++i, --j) // 1
        {
            System.out.print("sunt in for");
            sum = sum + i + j;
        }
        System.out.println("Sum = " + sum);

    }

}

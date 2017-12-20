/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realbrainer;

/**
 *
 * @author andad
 */
public class RealBrainer {

    /**
     * @param args the command line arguments
     */
    public void ifTest(boolean flag) {
        if (flag)//1
        {
            if (flag)//2   
            {
                System.out.println("True False");
            } else// 3 
            {
                System.out.println("True True");
            }
        } else // 4    
        {
            System.out.println("False False");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        RealBrainer rb = new RealBrainer();
        rb.ifTest(true);
        rb.ifTest(false);
    }

}

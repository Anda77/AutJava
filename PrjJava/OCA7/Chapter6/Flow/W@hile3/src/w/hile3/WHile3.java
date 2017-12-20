/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w.hile3;

/**
 *
 * @author andad
 */
public class WHile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] dataList = {"x", "y", "z"};
        for (String dataElement : dataList) {
            int innerCounter = 0;
            while (innerCounter < dataList.length) {
                System.out.println(dataElement + ", " + innerCounter);
                innerCounter++;
            }
            
        }
    }

}

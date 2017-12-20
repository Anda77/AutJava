/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array13;

/**
 *
 * @author andad
 */
public class Array13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variabila locala initializata cu null
        String[] dataArr = new String[4];
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        try {
            for (String data : dataArr) {
                System.out.print(data + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}

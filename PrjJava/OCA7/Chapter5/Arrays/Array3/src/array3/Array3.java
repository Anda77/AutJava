/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author anda
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "JAVA";
        s = s + "rocks";
        s = s.substring(4, 8); // 9 is not inclusive
        s.toUpperCase(); // attention s is not modified, s != s.
        System.out.println(s);
    }
    
}

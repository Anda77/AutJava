/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproces1;

import java.util.Scanner;

/**
 *
 * @author anda
 */
public class StringProces1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner("123 A 3b c 3,45, 82 L");
        while (sc.hasNext()) {
            if (sc.hasNextInt())
                System.out.println(sc.nextInt());
            else
                sc.next();

        }

    }

}

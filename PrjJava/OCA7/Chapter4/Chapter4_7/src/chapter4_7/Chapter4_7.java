/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_7;

/**
 *
 * @author anda
 */
public class Chapter4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Days d1 = Days.TH;
        Days d2 = Days.M;
        for (Days d : Days.values()) {
            //System.out.println(d);
            if (d.equals(Days.F)) {
                break;
            }
            System.out.println(d);
            d2 = d;
        }
        System.out.println((d1 == d2) ? "same old" : "newly new");
    }
    enum Days {M, T, W, TH, F, SA, SU};

}

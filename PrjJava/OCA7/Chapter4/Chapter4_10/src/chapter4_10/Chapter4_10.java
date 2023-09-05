/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_10;

/**
 *
 * @author anda
 */
public class Chapter4_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "0";
        Boat b = new Boat();
        Boat b2 = new SpeedBoat();
        SpeedBoat s2 = new SpeedBoat();
        if ((b instanceof Vessel) && (b2 instanceof Toy)) s += "1";
        if ((s2 instanceof Vessel) && (s2 instanceof Toy)) s +="2";
        System.out.println(s);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package null1;

/**
 *
 * @author andad
 */
public class Null1 {

    public static int[ ] getArray() {
    return null;
    }
    
    public static void main(String[] args) {
       
        int index = 1;
        try {
            System.out.println(getArray());
            System.out.println(getArray()[0]);
            int b = getArray()[index = 2];
        } catch (Exception e) {
            System.out.println(e);
        }
//empty catch
        System.out.println("index = " + index);
    }

}

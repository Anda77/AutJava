/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triplearray1;

/**
 *
 * @author andad
 */
public class TripleArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][][] arr = {{ { "a", "b" , "c"}, { "d", "e", null } },{ {"x"}, null },{{"y"}},{ { "z","p"}, {} } };
        System.out.println(arr[0][1][2]);
    }
    
}

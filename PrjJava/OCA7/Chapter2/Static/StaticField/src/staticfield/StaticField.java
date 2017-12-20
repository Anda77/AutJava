/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticfield;

/**
 *
 * @author andad
 */

class Super {
static String ID = "QBANK";
}

class Sub extends Super {
static String ID;

public Sub() { } //calls Super's default constructor. The Super class loads. By now, ID should already have the QBANK value!

static {
System.out.println("in sub"); 
}
}
public class StaticField {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Super.ID);
        System.out.println(Sub.ID);
    }
    
}

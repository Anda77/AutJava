/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyvalue2;

import java.util.Stack;

/**
 *
 * @author andad
 */
public class PassbyValue2 {

    /**
     * @param args the command line arguments
     */
    public static void processStacks(Stack x1, Stack x2) {
        x1.push(new Integer("100")); //assume that the method push adds the passed object to the stack.
        x2 = x1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        processStacks(s1, s2);
        System.out.println(s1 + "    " + s2);
    }

}

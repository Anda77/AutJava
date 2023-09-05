/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbyvalueref;

/**
 *
 * @author andad
 */
public class CallByValueRef {

    /**
     * @param args the command line arguments
     */
    public static String speak(String name) {
        name = name.concat("4");
        return name;
    }

    public static StringBuilder test(StringBuilder names) {
        names = names.append("4");
        return names;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Sam";
        name = speak(name);
        System.out.println(name); //Sam
        StringBuilder names = new StringBuilder("Sam");
        test(names);
        System.out.println(names); //Sam4
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switcfloat;

/**
 *
 * @author andad
 */
public class SwitcFloat {

    /**
     * @param args the command line arguments
     */
    public static int getSwitch(String str) {
        return (int) Math.round(Double.parseDouble(str.substring(1, str.length() - 1)));
    }

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        System.out.println(Double.parseDouble("--0.5"));
        System.out.println(Double.parseDouble(args[0].substring(1, args[0].length() - 1)));
        System.out.println(getSwitch(args[0]));
        switch (getSwitch(args[0])) {
            case 0:
                System.out.print("Hello ");
            case 1:
                System.out.print("World");
                break;
            default:
                System.out.print("Good Bye");
        }
    }

}

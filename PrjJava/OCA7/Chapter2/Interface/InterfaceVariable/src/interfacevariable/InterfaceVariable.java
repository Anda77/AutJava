/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacevariable;

/**
 *
 * @author andad
 */
public class InterfaceVariable implements IInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceVariable s = new InterfaceVariable();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
    }

}

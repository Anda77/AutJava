/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriddingerrorcompiler;

/**
 *
 * @author andad
 */
public class OverriddingErrorCompiler {

    /**
     * @param args the command line arguments
     */
    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(String s) {
        System.out.println("String Version");
    }

    public void method(StringBuffer s) {
        System.out.println("StringBuffer Version");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        OverriddingErrorCompiler  o = new OverriddingErrorCompiler();
        //o.method(null);
    }

}

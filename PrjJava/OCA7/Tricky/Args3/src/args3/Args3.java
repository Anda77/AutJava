/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package args3;

/**
 *
 * @author andad
 */
public class Args3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println(args);
        boolean hasParams = (args == null ? false : true);
        // hasParam is true, teapa
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
    
}

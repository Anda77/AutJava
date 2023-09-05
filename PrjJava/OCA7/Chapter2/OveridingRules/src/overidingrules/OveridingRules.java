/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overidingrules;

/**
 *
 * @author andad
 */
class A{
        public static void sM1() 
        {System.out.println("In base static"); } 
}

public class OveridingRules extends A{

    /**
     * @param args the command line arguments
     */
    public static void sM1(){
        System.out.println("In sub non-static"); }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

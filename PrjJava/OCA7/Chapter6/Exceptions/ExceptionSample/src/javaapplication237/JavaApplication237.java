/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication237;

/**
 *
 * @author andad
 */
public class JavaApplication237 {

   
    public static void main(String[] args) {
        
        try {
            System.out.println("try");
        } catch (RuntimeException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcastexception2;

/**
 *
 * @author andad
 */
class Parent {

    public Parent() {
        System.out.println("An instance of the Parent class was created!");
    }

}

final class Child extends Parent {

    public Child() {
        super();
        System.out.println("An instance of the Child class was created!");
    }
}

public class ClassCastException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parent p = new Parent();
        Child ch = new Child();
        //ch = p; //This statement is not allowed.
        p = ch;
    }

}

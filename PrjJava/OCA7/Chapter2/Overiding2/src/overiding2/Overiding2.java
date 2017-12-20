/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overiding2;

/**
 *
 * @author andad
 */
class A {

    int i = 7;

    A() {
        print();
    }

    static void print1() {
        System.out.println("static method superclasa");
    }

    void print() {
        System.out.println("A");
    }
}

public class Overiding2 extends A {

    /**
     * @param args the command line arguments
     */
    int i = 4;

    void print() {
        System.out.println(i);
    }
    
     static void print1() {
        System.out.println("static method subclasa, am ascuns metoda print1 din superclasa");
    }
     

    public static void main(String[] args) {
        // TODO code application logic here
        A a = new Overiding2();
        a.print();// because is overiding se apeleaza metoda obiectului Overiding2
        System.out.println(a.i); // se apeleaza instanta asociata referentei , deci din clasa A
        a.print1();// se apeleaza metoda asociata referentei , deci din clasa A

    }

}

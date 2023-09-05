/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigments1;

/**
 *
 * @author anda
 */
public class Assigments1 {

    /**
     * @param args the command line arguments
     */
    public Assigments1() {

    }
    Assigments1 as1;
    
       public Assigments1(Assigments1 as1) {
        this.as1 = as1;
    }
       

    public static void main(String[] args) {
        // TODO code application logic here
        Assigments1 m2 = new Assigments1();
        Assigments1 m3 = new Assigments1(m2);
        m3.go();

        Assigments1 m4 = m3.as1;
        Assigments1 m5 = m2.as1;
        m4.go();
        m5.go();

    }

 

    void go() {
        System.out.print("hi ");
    }

}

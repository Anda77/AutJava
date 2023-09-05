/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author andad
 */
class X
{
    void go()
    {
        System.out.println("X");
    }
}
class Y extends X
{
    void go()
    {
        System.out.println("Y");
    }
}
class Z extends Y
{
    void go()
    {
        System.out.println("Z");
    }
}

public class Inheritance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        X z = new Z();
        X y = new Y();
        Z y2 = (Z)y;
        z.go();
        y.go();
        y2.go();
    }
    
}

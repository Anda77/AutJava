/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface7;

/**
 *
 * @author andad
 */
interface Bozo {

    int type = 0;

    public void jump();
}

public class Interface7 implements Bozo {

    public Interface7() {
        //type = 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bozo b = new Interface7();
        b.jump();

    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

}

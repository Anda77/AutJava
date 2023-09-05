/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecise64;

/**
 *
 * @author andad
 */
public class Excecise64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //System.out.println(args[0]);
            //checkFood(args[0]);
            //checkFood("junkfood");
             checkFood("biofood");
        } catch (BadFoodException e) {
            System.out.println("This is junk food");
        }
    }

    private static void checkFood(String food) throws BadFoodException {
        if (food.equals("junkfood")) {
            throw new BadFoodException();
        } else {
            System.out.println("This is bio food");
        }
    }

}

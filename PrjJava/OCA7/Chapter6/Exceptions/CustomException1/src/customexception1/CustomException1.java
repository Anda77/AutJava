/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception1;

/**
 *
 * @author andad
 */
public class CustomException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CatEx{
        // TODO code application logic here

        try {

            throw new DogEx();

        } catch (DogEx e) {
            throw new DogEx();
        } finally {

            throw new CatEx();
        }
    }

}

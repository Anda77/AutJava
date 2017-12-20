/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string2;

/**
 *
 * @author anda
 */
public class String2 {

    /**
     * @param args the command line arguments
     */
    private String title;
    public String getTitle()
    {
        return title;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String2 str = new String2();
        //str.getTitle();
        System.out.println("The title is " +  str.getTitle());
    }
    
}

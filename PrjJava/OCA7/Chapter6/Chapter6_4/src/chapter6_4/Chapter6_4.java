/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6_4;

/**
 *
 * @author andad
 */
public class Chapter6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String o = "-";
        String[] sa = new String[4];
        System.out.println(args[0]);
        for(int i = 0;i<sa.length;i++)
        {
            sa[i] = args[i];
        }
       
        for(String n: sa)
        {
            switch(n.toLowerCase())
            {
                case "yellow" : o +="y";
                case "red" : o +="r";
                case "green" : o +="g";
            }
        }
        System.out.print(o);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberformat1;

import java.text.NumberFormat;
import java.text.ParseException;


/**
 *
 * @author andad
 */
public class NumberFormat1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args)  {
        // TODO code application logic here
       try
       {
        String[] sa = {"111.234", "222.5678"};
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        for (String s : sa) {
            System.out.println(nf.parse(s));
        }
       }
       catch(ParseException ex)
       {
          ex.printStackTrace(); 
       }
       
    }

}

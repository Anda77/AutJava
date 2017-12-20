/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception8;

/**
 *
 * @author anda
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class Exception8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // MissingFormatArgumentException exception
        //System.out.printf("num is %.2f\n" + Math.PI);
        //String.format("%s", "anda");
        //java.util.UnknownFormatConversionException

        Calendar c = new GregorianCalendar(1995, MAY, 23);
        String s = String.format("Duke's Birthday: %1$tu %1$te,%1$ty", c);
        System.out.println(s);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnvalue;
import static java.lang.System.out;

/**
 *
 * @author anda
 */
public class ReturnValue {

    /**
     * @param args the command line arguments
     */
    public static int foo1()
    {
        double f = 32.5f;
        return (int)f;
    }
    public static void foo2()
    {
        return;
    }
    public static Object getObject()
    {
        int[] num = {1, 2,3};
        return num;
    }
    public static int foo()
    {
        return 'c';
    }
    public static void main(String[] args) {
        // TODO code application logic here
        out.println(foo());
        out.println(foo1());
        out.println(getObject());
       
        
    }
    
}

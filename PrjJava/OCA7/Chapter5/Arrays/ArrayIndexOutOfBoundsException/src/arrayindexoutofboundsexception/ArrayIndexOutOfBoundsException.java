/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayindexoutofboundsexception;

/**
 *
 * @author andad
 */
public class ArrayIndexOutOfBoundsException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { doSomething(); } 
        catch (MySpecialException e) 
        { System.out.println(e); } 
    } 
    static void doSomething() 
    { int[] array = new int[4]; 
    array[4] = 4; 
    doSomethingElse(); } 
    static void doSomethingElse() { 
        throw new MySpecialException("Sorry, can't do something else"); 
    }
}
    
class MySpecialException extends RuntimeException
{
    String message;
    MySpecialException(String msg)
    {
        this.message = msg;
    }
}

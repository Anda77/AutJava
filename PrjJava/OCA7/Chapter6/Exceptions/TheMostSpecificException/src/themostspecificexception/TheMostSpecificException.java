/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themostspecificexception;

/**
 *
 * @author andad
 */
class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

// exception has already been caught
public class TheMostSpecificException {

    /**
     * @param args the command line arguments
     */
    void myMethod() throws MyException{
      throw new MyException3();
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TheMostSpecificException et = new TheMostSpecificException();
        try {
            et.myMethod();
        }
        catch (MyException3 me3) {
            System.out.println("MyException3 thrown");
        }
        catch (MyException me) {
            System.out.println("MyException thrown");
        } 
        finally {
            System.out.println(" Done");
        }
    }

}

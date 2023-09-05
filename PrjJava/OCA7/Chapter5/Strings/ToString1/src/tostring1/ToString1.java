/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring1;

/**
 *
 * @author andad
 */
class Super{
        public String toString()
        {return "4";}
}

public class ToString1 extends Super{

    /**
     * @param args the command line arguments
     */
    public String toString(){
           return super.toString()+"3"; 
           }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( new ToString1() );
    }
    
}

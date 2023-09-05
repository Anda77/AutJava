/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchciudat;

/**
 *
 * @author andad
 */
public class SwitchCiudat {

    /**
     * @param args the command line arguments
     */
    public SwitchCiudat(String s)
    {}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        switch(Integer.parseInt(args[1]))  //1
       {
          case 0 :
             boolean b = false;
             break;
     
          case 1 :
             b = true; //2
             break;
       }
       
       if(b) 
           System.out.println(args[2]);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntype;

/**
 *
 * @author andad
 */
public class ReturnType {

    /**
     * @param args the command line arguments
     */
    
    public double methodX( byte by){
    double d = 10.0;
    return (long) by/d*3;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ReturnType r = new ReturnType();
        System.out.print(r.methodX((byte)1));
    }
    
}

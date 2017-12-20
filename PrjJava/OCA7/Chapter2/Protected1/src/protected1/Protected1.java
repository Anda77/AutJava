/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protected1;

/**
 *
 * @author anda
 */
public class Protected1 extends Felix{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Protected1 p = new Protected1();
        System.out.println(p.x);
    }
    protected long cat() {
        return 7;
    }
    
    private long cat(int x)
    {
        return 9;
    }
    
}

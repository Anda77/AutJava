/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorthrowsexception;

import java.io.IOException;

/**
 *
 * @author andad
 */
class PortConnector {

    public PortConnector(int port) throws IOException {
    }
    void m() throws IOException{ }
}

public class ConstructorThrowsException extends PortConnector {

    /**
     * @param args the command line arguments
     */
    public ConstructorThrowsException(int port) throws Exception {
        super(port);
    }
    
    void m() throws IOException{ }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

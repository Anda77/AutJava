/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdelete;

/**
 *
 * @author andad
 */
public class StringBuilderDelete {

    /**
     * @param args the command line arguments
     */
    private StringBuilder sb = new StringBuilder();

    public void logMsg(String location, String message) {
        sb.append(location);
        sb.append("-");
        sb.append(message);
    }

    public void dumpLog() {
        System.out.println(sb.toString());
        sb.delete(0, sb.length());

    }
//Empty the contents of sb here     }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

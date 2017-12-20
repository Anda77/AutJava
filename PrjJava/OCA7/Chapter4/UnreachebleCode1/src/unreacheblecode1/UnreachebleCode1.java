/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unreacheblecode1;

/**
 *
 * @author andad
 */
public class UnreachebleCode1 {

    /**
     * @param args the command line arguments
     */
    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
    
    public static void main(String[] args) {
        // TODO code application logic here
        int index = 0;
        for (String day : days) {
            if (index == 3) {
                break;
            } else {
                continue;
            }
            index++;
            if (days[index].length() > 3) {

                days[index] = day.substring(0, 3);
            }
           
        }
        System.out.println(days[index]);
    }

}

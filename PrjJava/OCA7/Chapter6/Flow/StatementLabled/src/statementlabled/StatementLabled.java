/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementlabled;

/**
 *
 * @author andad
 */
public class StatementLabled {

    /**
     * @param args the command line arguments
     */
    public void method1(int i) {
        int j = (i * 30 - 2) / 100;

        POINT1:
        for (; j < 10; j++) {
            boolean flag = false;
            while (!flag) {
                if (Math.random() > 0.5) {
                    break POINT1;
                }
            }
        }
        while (j > 0) {
            System.out.println(j--);
            if (j == 4) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        StatementLabled stmt = new StatementLabled();
        stmt.method1(7);

    }

}

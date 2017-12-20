/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplebreaklabeled;

/**
 *
 * @author anda
 */
public class SampleBreaklabeled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        first:
        for (int i = 0; i < 4; ++i) {
            second:
            for (int j = 0; j < 4; ++j) {
                third:
                for (int k = 0; k < 4; ++k) {
                    System.out.println("inner start: i+j+k " + (i + j + k));
                    if (i + j + k == 5) {
                        continue third;
                    }
                    if (i + j + k == 7) {
                        continue second;
                    }
                    if (i + j + k == 8) {
                        break second;
                    }
                    if (i + j + k == 9) {
                        break first;
                    }
                    System.out.println("inner stop:  i+j+k " + (i + j + k));
                }
            }
        }
    }

}

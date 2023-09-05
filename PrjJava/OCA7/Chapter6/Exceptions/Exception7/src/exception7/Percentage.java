/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception7;

/**
 *
 * @author anda
 */
public class Percentage {
    private final int value;

  /**
   * A percentage value must be between 0 and 100 inclusive.
   * 
   * @param value
   *          the percentage value
   */
  public Percentage(int value) {
    if (value < 0 || value > 100) {
      throw new IllegalArgumentException(Integer.toString(value));
    }
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}

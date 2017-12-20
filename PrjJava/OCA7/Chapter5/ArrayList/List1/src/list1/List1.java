/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andad
 */
class Apple {
}

public class List1 extends Apple {

    /**
     * @param args the command line arguments
     */
    public static void basket2(List<? super Apple> list) {
        list.add(new Apple());
    }

    public static void basket1(List<?> list) {
        list.size();
    }

    public static void basket(List<Apple> list) {
        list.add(new Apple());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        List<Apple> a = new ArrayList<Apple>();
        basket(a);
        basket1(a);
        basket2(a);

    }

}

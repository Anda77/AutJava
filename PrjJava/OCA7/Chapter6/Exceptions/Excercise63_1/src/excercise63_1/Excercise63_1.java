package excercise63_1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Excercise63_1 {

    public static void main(String[] args) {

        try {

            String reverseStr = reverse("");

            System.out.println(reverseStr);

        } finally {

            System.out.println("Program completes");

        }

    }

    public static String reverse(String s) {

        if (s.length() == 0) {

            throw new IllegalArgumentException("string can't be zero"); // runtime exception . unchecked exception

        }

        String reverseStr = "";

        return reverseStr;

    }
}

package loops;

import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        System.out.println("the even number are");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("the odd number are");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");
                // System.out.println();
            }
        }
    }
}
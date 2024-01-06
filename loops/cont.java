package loops;

import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; a!=0; i++) {
            a /= 10;
            count++;

        }
        System.out.print(count);
    }
}

package loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number ");
         int n = sc.nextInt();
        int a =2,d=3;
        for (int  i =0; i <=n; i++) {
            System.out.println(a);
            a+=d;
            
        }
    }
}

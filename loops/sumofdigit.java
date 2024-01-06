package loops;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nubmer ");
        int n = sc.nextInt();
        int sum =0;
         while (n != 0) {
        int lastdigit = n%10; //lastdigit 
        sum = sum+lastdigit;
            n/=10;
        }
        System.out.println(sum);
       
    }
}


package loops;

import java.util.Scanner;

/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i<=n-1; i++) 
        {
            if (n%i==0) {
                isprime=false;
              
            }
        }
      if (isprime==true) {
        System.out.println("it is prime number ");
        
      }
      else{
        System.out.println("it is composive number ");
      }

    }
}
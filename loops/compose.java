package loops;

import java.util.Scanner;

public class compose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int x= 0;
        for (int i = 2; i <=n-1; i++) {
            if(n%i==0){
                System.out.println("it is composive number");
                x=1;
                break;
            }
            
        }
        if (n==1) System.out.println("nither it is prime nor composive number "); 
          else if (x==0) {
            System.out.println("it is prime number ");

            
        }
    }
}

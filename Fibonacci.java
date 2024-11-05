package assignment5;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int f0 = 0, f1 = 1, f;

        System.out.print(f0 + ", " + f1);
        for (int i = 2; i < n; i++) {
            f = f0 + f1;
            System.out.print(", " + f);
            f0 = f1;
            f1 = f;
        }
    }
}

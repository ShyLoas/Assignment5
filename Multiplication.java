package assignment5;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + (i + 1) + " = " + (n * (i + 1)));
        }
    }
}

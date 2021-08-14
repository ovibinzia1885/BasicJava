package Basic;

import java.util.Scanner;
import java.lang.Math;

public class Square_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second  number:");
        int b = input.nextInt();
//        sumOfNumber=a+b;
        Double pow = Math.pow(a+b, 2);
        System.out.println("The square number is :"+pow);
    }
}

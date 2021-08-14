package Basic;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter Third number:");
        int num3 = input.nextInt();
        int sum=num1+num2+num3;
        System.out.println("Sum of three number:"+sum);
        double avg=(num1+num2+num3)/3;
        System.out.println("Average Number:"+avg);



    }
}

package Basic;

import java.util.Scanner;

public class Random_number_generate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Random interger number:");
        int min = input.nextInt();
        System.out.println("Enter second integer  number:");
        int max = input.nextInt();
        System.out.println(Math.random()*(max-min)+min);
    }
}

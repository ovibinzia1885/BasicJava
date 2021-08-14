package conditional_statement;

import java.util.Scanner;

//Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)
//
public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the swe101: ");
        double swe101 = input.nextDouble();
        System.out.print("Input the swe102: ");
        double swe102 = input.nextDouble();
        System.out.print("Input the swe103: ");
        double swe103 = input.nextDouble();
        System.out.print("Input the swe104: ");
        double swe104 = input.nextDouble();
        double avg = (swe101*4 + swe102*4 + swe103*4 + swe104*4) /12;
        System.out.println(avg);
        if(avg==40||avg<50){
            System.out.println("your Grade is C ");
        }
        else if(avg==50||avg<60){
            System.out.println("your Grade is C+ ");

        }
        else if(avg==60||avg<65){
            System.out.println("your Grade is B ");

        }
        else if(avg==65||avg<70){
            System.out.println("your Grade is B+ ");

        }
        else if(avg==70||avg<80){
            System.out.println("your Grade is A ");

        }
        else if(avg==80||avg<=100){
            System.out.println("your Grade is A+ ");

        }

        else{
            System.out.println("Nothing");
        }


    }
}
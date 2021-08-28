package Function_Array;

import java.util.Scanner;

public class MyFunction {
    public static void main(String[] args) {
//        Is_Volter();
      int sum=  PlusNumber(3,4);
      System.out.println(sum);


    }
    public static void  Is_Volter(){

        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if(age>=18){
            System.out.println("Voter");

        }
        else{
            System.out.println("Not a voter");
        }

    }

    public static int PlusNumber(int a,int b){
        return a+b;
    }
    public static double Multiple(int a,int b){
        return a*b;
    }
}

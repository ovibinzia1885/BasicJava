package Function_Array;

import java.util.Arrays;
import java.util.Scanner;

////2. Find the second largest number from an array by user input using function
public class Array_sort {
    public static void main(String[] args) {
        int size=10;
        int[] number=new int[size];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<size;i++ ){
            number[i]=scanner.nextInt();

        }
        Arrays.sort(number);
        int secondLargestNumber=number[number.length-2];
        System.out.println(secondLargestNumber);
    }
}

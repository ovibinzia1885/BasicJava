package Function_Array;

public class Max_number_array {
    public static void main(String[] args) {
        int [] number={20,30,50,60,40,70};
        int max=number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println(max);
    }
}

package Function_Array;

public class myArray3 {
    public static void main(String[] args) {
        int[]num={10,20,30,40};
        int sum=0;
        for(int i=0;i<num.length;i++){

            if(num[i]%2==0){
                sum=sum+num[i];
            }

        }
        System.out.println(sum);
    }
}

package Function_Array;

public class Match_position {
    public static void main(String[] args) {
        int [] numbers={10,5,2,3,2,2,7,7,15,10};
        System.out.println(CheckIfExists(2,numbers));

    }
    public static int CheckIfExists(int num,int[]numbers){
        for(int i=0;i<numbers.length;i++){
            if(num==numbers[i]){
                return i;
            }
        }
        return -1;
    }
}

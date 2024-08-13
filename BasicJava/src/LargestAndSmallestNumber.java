import java.util.Arrays;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        int numbers[]={23,54,11,67};
       int largest=numbers[0];
       int smallest=numbers[0];
       for(int i=1; i<numbers.length;i++){
           if (numbers[i]>largest){
               largest=numbers[i];
           } else if (numbers[i]<smallest) {
              smallest=numbers[i];
           }
       }
        System.out.println("numbers:"+ Arrays.toString(numbers));
        System.out.println("largest number:"+largest);
        System.out.println("smallest number:"+smallest);

    }
}

import java.util.Scanner;

public class  ReverseANumber {
    public static void main(String[] args) {

        int rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers for reverse:");
        int no=sc.nextInt();
        while (no!=0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
            System.out.println(rev);
        }
        System.out.println(rev);
    }
}

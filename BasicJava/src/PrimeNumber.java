import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int  temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int no=sc.nextInt();

        for(int i=2;i<=no-1;i++)
            if(no%i==0)
            {
            temp=temp+1;
        }
        if(temp==0){

            System.out.println(no+" is a prime no.");
        }
        else
        {
            System.out.println(no+" is not  a prime no.");
        }

    }
}

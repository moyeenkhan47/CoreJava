import java.util.Scanner;

public class Palindrome {
    public  static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rev=0, rem,temp;
        temp=num;
        while (num>0){
          rem=num%10;
          rev=rev*10+rem;
          num=num/10;
        }
        if (temp==rev)
            System.out.println(temp+ " is palindrome");
        else
            System.out.println(temp+ " is not palindrome");
    }
}

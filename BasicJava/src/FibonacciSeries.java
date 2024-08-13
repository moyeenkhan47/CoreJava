import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String [] args) {
        int a = 0, b = 1;
        int c;
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of count: ");
        int n=sc.nextInt();

        System.out.println(a + " " + b);
        for (int i =0; i<= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println( c);
        }

    }
}


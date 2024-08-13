import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first no1:-");
            int no1 = s.nextInt();
            System.out.println("Enter Second no2:-");
            int no2 = s.nextInt();
            System.out.println("Select symbol(+ - * /):-");
            String symbol = s.next();
            int Res;
            switch (symbol) {
                case "+":
                    Res = no1 + no2;
                    System.out.println("Addition is:" + Res);
                    break;
                case "-":
                    Res = no1 - no2;
                    System.out.println("Substraction is:" + Res);
                    break;
                case "*":
                    Res = no1 * no2;
                    System.out.println("Multiply is:" + Res);
                    break;
                case "/":
                    Res = no1 / no2;
                    System.out.println("Division is:" + Res);
                    break;
                default:
                    System.out.println("Invalid Symbol");
            }

            System.out.println("press y for  yes and no for n");
            yn = s.next();
        }
        while (yn.equals("y") || yn.equals("Y")) ;
    }

}


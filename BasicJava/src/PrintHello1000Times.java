public class PrintHello1000Times {
  static int count=1;
    public static void callNum(){

        if (count<=100) {
            System.out.println("Hello");
            count++;
            callNum();

        }

    }
    public static void main(String[] args){
callNum();
    }
}

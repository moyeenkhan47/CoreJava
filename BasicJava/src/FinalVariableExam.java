public class FinalVariableExam {
    public static void main(String[] args) {
        System.out.println(X.e);

    }

}
    class X {
        public static final  int e=100;
        
        static {

            System.out.println(" in static block");
        }

    }



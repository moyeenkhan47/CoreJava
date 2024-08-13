public class D {
    public static void main(String[] args) {
        String name=" Abdul ";
        String s="i";
        s=s.replace("i","iiiiiiiiii"); //10
        s=s.replace("i","iiiiiiiiii");//10*10
        s=s.replace("i","iiiiiiiiii"); //100*10
        s=s.replace("i","name"+ "\n");
        System.out.println(s);
    }
}

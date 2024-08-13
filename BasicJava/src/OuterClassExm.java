 class OuterClassExm {
    int x=10;

public class InnerClass{
    int y=15;
}
}
class Mall{

    public static void main(String[] args) {
        OuterClassExm myOuter= new OuterClassExm();
        OuterClassExm.InnerClass myInner=myOuter.new InnerClass();
        System.out.println(myInner.y+ myOuter.x);

    }
}

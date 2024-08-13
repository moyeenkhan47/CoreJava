public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern() {

    }

    void show() {
        System.out.println("hi");
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}

class A{
    public static void main(String[] args) {
        SingletonPattern sp = SingletonPattern.getInstance();
        sp.show();
    }
}


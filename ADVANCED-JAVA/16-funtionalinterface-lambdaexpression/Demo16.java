@FunctionalInterface
interface A { // functoinal interface / SAM single abstract interface
    void show();
}

@FunctionalInterface
interface B {
    void show(String arg);
}

@FunctionalInterface
interface C {
    void show(int n, String arg);
}

@FunctionalInterface
interface D {
    int add(int n1, int n2);
}

interface Z { // marker interface
}

public class Demo16 {
    public static void main(String[] args) {

        A a = () -> System.out.println("lambda expression"); // lambda expression
        B b = arg -> System.out.println("lambda expression with " + arg);
        C c = (int n, String arg) -> System.out.println("lambda expression with " + n + " " + arg);
        D d = (int n1, int n2) -> n1 + n2;

        a.show();
        b.show("one argument");
        c.show(2, "arguments");
        d.add(2, 3);
    }
}

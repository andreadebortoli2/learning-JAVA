@FunctionalInterface
interface A16 { // functoinal interface / SAM single abstract interface
    void show();
}

@FunctionalInterface
interface B16 {
    void show(String arg);
}

@FunctionalInterface
interface C16 {
    void show(int n, String arg);
}

@FunctionalInterface
interface D16 {
    int add(int n1, int n2);
}

interface Z16 { // marker interface
}

public class Demo16 {
    public static void main(String[] args) {

        A16 a = () -> System.out.println("lambda expression"); // lambda expression
        B16 b = arg -> System.out.println("lambda expression with " + arg);
        C16 c = (int n, String arg) -> System.out.println("lambda expression with " + n + " " + arg);
        D16 d = (int n1, int n2) -> n1 + n2;

        a.show();
        b.show("one argument");
        c.show(2, "arguments");
        d.add(2, 3);
    }
}

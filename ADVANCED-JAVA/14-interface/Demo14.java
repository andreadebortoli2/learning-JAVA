interface A14 {

    int n = 2; // by default final and static

    void show(); // by default public and abstract
}

interface C14 {
    void run();
}

interface D14 extends C14 {
}

class B14 implements A14, D14 {
    public void show() {
        System.out.println("implements show method from interface");
    }

    public void run() {
        System.out.println("run from second interface");
    }
}

public class Demo14 {
    public static void main(String[] args) {

        A14 a;
        System.out.println(A14.n);

        a = new B14();
        a.show();

        B14 b = new B14();
        b.show();
        b.run();

    }
}

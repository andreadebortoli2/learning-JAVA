interface A {

    int n = 2; // by default final and static

    void show(); // by default public and abstract
}

interface C {
    void run();
}

interface D extends C {
}

class B implements A, D {
    public void show() {
        System.out.println("implements show method from interface");
    }

    public void run() {
        System.out.println("run from second interface");
    }
}

public class Demo14 {
    public static void main(String[] args) {

        A a;
        System.out.println(A.n);

        a = new B();
        a.show();

        B b = new B();
        b.show();
        b.run();

    }
}

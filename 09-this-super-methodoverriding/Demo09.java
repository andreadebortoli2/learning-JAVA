class A {

    public A() {
        System.out.println("A constructor");
    }

    public A(int n) {
        this(); // call also the default constructor in same class
        System.out.println("A constructor with parameter");
    }

    public void show() {
        System.out.println("Show A");
    }
}

class B extends A {

    public B() {
        System.out.println("B constructor with parameter");
    }

    public B(int n) {
        super(n); // call the parent constructor with parameters
        System.out.println("B constructor with parameter");
    }

    public void show() { // method overriding
        System.out.println("Show B");
    }
}

public class Demo09 {

    public static void main(String[] args) {
        B b = new B(5);
        b.show();
    }
}
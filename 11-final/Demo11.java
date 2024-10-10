final class A { // block the inheritance (cannot have child classes)

    public final void show() { // block the possibility for child classes to override the method
        System.out.println("Show A");
    }

}

public class Demo11 {

    public static void main(String[] args) {
        final int num = 5; // make it a constant (not mutable)
        System.out.println(num);

        A a = new A();
        a.show();
    }
}
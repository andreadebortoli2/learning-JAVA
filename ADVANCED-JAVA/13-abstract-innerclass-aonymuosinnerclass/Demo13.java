// * ABSTRACT
abstract class A {
    public abstract void showAbstract(); // abstact class can define abstract methods without implementation
}

class B extends A {
    public void showAbstract() { // child of abstract clast must implement abstract methods
        System.out.println("show Abstract");
    }
}

// * inner class
class C {
    public void showC() {
        System.out.println("show C");
    }

    class D {
        public void showInnerClassD() {
            System.out.println("show Inner Class D");
        }
    }

    static class E {
        public void showStaticInnerClass() {
            System.out.println("show Static Inner Class E");
        }
    }
}

public class Demo13 {

    public static void main(String[] args) {

        // * ABSTRACT
        A a = new B();
        a.showAbstract();

        System.out.println("------");

        // * inner class
        C c = new C();
        C.D d = c.new D();
        c.showC();
        d.showInnerClassD();

        // * static inner class
        C.E e = new C.E();
        e.showStaticInnerClass();

        // * anonymous inner class
        C c2 = new C() {
            public void showC() {
                System.out.println("override showC method in anonymous inner class");
            }
        };
        c2.showC();

        System.out.println("------");

        // * anonymous abstract inner class
        A a2 = new A() {
            public void showAbstract() {
                System.out.println("show aonymous Abstract inner class");
            }
        };
        a2.showAbstract();
    }
}
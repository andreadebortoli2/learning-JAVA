// * ABSTRACT
abstract class A13 {
    public abstract void showAbstract(); // abstact class can define abstract methods without implementation
}

class B13 extends A13 {
    public void showAbstract() { // child of abstract clast must implement abstract methods
        System.out.println("show Abstract");
    }
}

// * inner class
class C13 {
    public void showC() {
        System.out.println("show C");
    }

    class D13 {
        public void showInnerClassD() {
            System.out.println("show Inner Class D");
        }
    }

    static class E13 {
        public void showStaticInnerClass() {
            System.out.println("show Static Inner Class E");
        }
    }
}

public class Demo13 {

    public static void main(String[] args) {

        // * ABSTRACT
        A13 a = new B13();
        a.showAbstract();

        System.out.println("------");

        // * inner class
        C13 c = new C13();
        C13.D13 d = c.new D13();
        c.showC();
        d.showInnerClassD();

        // * static inner class
        C13.E13 e = new C13.E13();
        e.showStaticInnerClass();

        // * anonymous inner class
        C13 c2 = new C13() {
            public void showC() {
                System.out.println("override showC method in anonymous inner class");
            }
        };
        c2.showC();

        System.out.println("------");

        // * anonymous abstract inner class
        A13 a2 = new A13() {
            public void showAbstract() {
                System.out.println("show aonymous Abstract inner class");
            }
        };
        a2.showAbstract();
    }
}
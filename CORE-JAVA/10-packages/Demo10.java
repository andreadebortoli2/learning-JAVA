import a.A; // "*" import all package's files 
import a.b.B;

public class Demo10 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        B obj2 = new B();
        obj2.show();
    }
}

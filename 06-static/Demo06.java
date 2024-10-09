class Phone {
    String name; // instance variable
    static String type; // static variable
    static int quantity;

    static { // static block
        quantity = 1;
    }

    public void printData() {
        System.out.println(type + " : " + name + " - quantity : " + quantity);
    }

    public static void show(Phone p) { // static method
        System.out.println(type + " : " + p.name + " - quantity : " + quantity);
    }
}

public class Demo06 {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.name = "Pixel";

        Phone obj2 = new Phone();
        obj2.name = "Iphone";

        Phone.type = "Smartphone";

        // obj1.printData();
        // obj2.printData();

        Phone.show(obj1);
    }
}
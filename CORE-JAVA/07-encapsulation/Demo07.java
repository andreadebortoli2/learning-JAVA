/**
 * Human
 */
class Human {

    private int age;
    private String firstName;
    private String lastName;

    // default constructor
    public Human() {
        this.firstName = "Mary";
        this.lastName = "Doe";
        this.age = 20;
    }

    // parameterized constructor /in this case is also a constractor overload
    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // setters
    public void setAge(int a) {
        age = a;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; // usage of "this" keyword
    }

    // getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    // method for anonymous obj
    public void sayHello() {
        System.out.println("Anonymous Hello");
    }

}

public class Demo07 {
    public static void main(String[] args) {

        Human h1 = new Human("John", "Doe", 30);
        Human h2 = new Human();
        // h1.setAge(30);
        // h1.setFirstName("John");
        System.err.println(h1.getName() + " is " + h1.getAge() + " years old");
        System.err.println(h2.getName() + " is " + h2.getAge() + " years old");

        // anonymous obj
        new Human().sayHello();

    }
}

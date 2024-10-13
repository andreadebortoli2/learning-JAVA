import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class User {

    private String name;
    private int id;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + "]";
    }

}

public class Demo21 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Mary", "Jane", "Tom", "Jerry");

        // optional class

        Optional<String> name = names.stream()
                .filter(str -> str.contains("s"))
                .findFirst();

        System.out.println(name.orElse("Not Found"));

        String name2 = names.stream()
                .filter(str -> str.contains("s"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name2);

        System.out.println("-----");

        // method reference

        List<String> uNames = names.stream()
                .map(String::toUpperCase) // refernce -> class::method
                .toList();

        System.out.println(uNames);

        System.out.println("-----");

        // constructor reference

        List<User> users = new ArrayList<>();

        users = names.stream()
                // .map(n -> new User(n)) // lambda suyntax version
                .map(User::new) // reference -> class::new
                .toList();

        System.out.println(users);
    }
}

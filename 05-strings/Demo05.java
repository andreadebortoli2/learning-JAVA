public class Demo05 {
    public static void main(String[] args) {
        // strings are immutable, if you change a string in reality you're creating a
        // new string and the old became elegible for garbage collection
        // string in heap memory is immutable unless you use a string buffer
        // string buffer give an extra space in memory to manage changes

        StringBuffer sb = new StringBuffer("John");
        sb.append(" Doe");

        System.out.println(sb);

    }
}
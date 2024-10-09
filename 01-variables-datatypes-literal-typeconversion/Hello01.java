/**
 * Hello01
 */
public class Hello01 {

    public static void main(String[] args) {

        // primitive data types
        int num = 3;

        byte num4 = 6;

        float num2 = 2.34f;

        double num3 = 126.6;

        System.out.println(num + " " + num4 + " " + num2 + " " + num3);

        char character = 'a';
        System.out.println(character);

        character++;
        System.out.println(character);

        boolean var = true;
        System.out.println(var);

        System.out.println("-------");

        // type conversion and casting
        byte b = 127;
        int a = 257;
        int k = 2;

        k = b; // conversion
        System.out.println(k);

        b = (byte) a; // casting
        System.out.println(b); // convert with modulus

        float f = 23.6f;
        int i = (int) f; // casting
        System.out.println(i); // it lost numbers after the comma

        byte x = 10;
        byte y = 30;

        int result = x * y; // type promotion
        System.out.println(result);

    }
}
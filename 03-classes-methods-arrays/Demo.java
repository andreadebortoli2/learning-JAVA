/**
 * Calculator
 */
class Calculator {
    int a; // property

    public int add(int x, int y) { // method
        int r = x + y;
        return r;
    }

    // method overloading
    public double add(double x, int y) {
        return x + y;
    }
}

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 6;

        Calculator calc = new Calculator(); // create the object

        int result = calc.add(num1, num2); // use the method

        System.out.println(result);

        System.out.println("--------");

        // arrays

        int nums[] = { 1, 2, 3, 4 };
        System.out.println(nums[0]);
        nums[0] = 8;
        System.out.println(nums[0]);
        // create an empty array with fixed dimension
        char alphabet[] = new char[26];
        alphabet[0] = 'a';

        // multi dimensional array

        int numsInNums[][] = new int[3][5];
        numsInNums[1][2] = 6;
    }
}

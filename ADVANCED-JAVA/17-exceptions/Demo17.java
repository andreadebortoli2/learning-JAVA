class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

class A {
    public void showClassName() throws Exception {
        Class.forName("Calc");
    }
}

public class Demo17 {
    public static void main(String[] args) {

        int n = 20;
        int result = 0;

        int[] nums = new int[5];

        try {
            result = 18 / n;
            if (result == 0)
                throw new CustomException("result is zero");
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.err.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong: " + e.getMessage());
        }

        System.out.println(result);

        System.out.println("Bye");

        A a = new A();
        try {
            a.showClassName();
        } catch (Exception e) {
            System.out.println("cannot find class: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

/**
 * Hello02
 */
public class Hello02 {

    public static void main(String[] args) {

        // num++; post-increment
        // ++num; pre-increment

        int num = 1;
        int result = num++;
        System.out.println(result);

        int num2 = 3;
        int result2 = ++num2;
        System.out.println(result2);

        if (num > num2)
            System.out.println("num is bigger");
        else if (num < num2)
            System.out.println("num is smaller");
        else {
            System.out.println("nums are equal");
            System.out.println(num);
        }

        // ternary operators num == num2 ? x : y ;

        // switch

        int i = 1;

        switch (i) {
            case 1:
                System.out.println(i);
                break;

            default:
                System.out.println("n is not 1");
        }

        // loops

        while (i < 5) {
            System.out.println("while - " + i);
            i++;
        } // first check condition then execute

        System.out.println("i value now is " + i);

        do {
            System.out.println("do while - " + i);
            i++;
        } while (i < 5); // first execute then check the condition

        for (int j = 0; j < 5; j++) {
            System.out.println("for - " + j);
        }

    }

}
/**
 * User
 */
class User {
    int ID;
    String name;
}

/**
 * Demo
 */
public class Demo {
    public static void main(String[] args) {

        int nums[][] = new int[4][]; // jagged
        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[2];
        nums[3] = new int[9];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // enanched for loop (foreach)
        for (int[] n : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //array of objects
        User u1 = new User();
        u1.ID = 1;
        u1.name = "John";
        
        User u2 =new User();
        u2.ID = 2;
        u2.name = "Mary";

        User users[] = new User[2];
        users[0] = u1;
        users[1] = u2;

        for(User u : users){
            System.out.println(u.ID + " : " + u.name);            
        }
        
    }
}

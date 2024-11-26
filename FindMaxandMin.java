import java.util.*;
public class FindMaxandMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Enter 1st number: ");
         int x = s.nextInt();
         System.out.println("Enter 2nd number: ");
         int y = s.nextInt();
         System.out.println("The maximum between the two numbers is: " + findM(x, y));
        System.out.println("The minimum between the two numbers is: " + mini(x, y) );
    }
    public static int findM(int a, int b) {
       int c = Math.max(a, b);
       return c;
    }
    public static int mini(int a, int b) {
        int c = Math.min(a, b);
        return c;
    }
    
}



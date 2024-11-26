import java.util.*;
public class MathFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          System.out.println("Enter 1st number: ");
          int x = s.nextInt();
          System.out.println("Enter 2nd number: ");
          int y = s.nextInt();
          System.out.println("The maximum between the two numbers is: " + findMax(x, y));
    }
    public static int findMax(int a, int b) {
        int x = Math.max(a, b);
       return x;
       
    }
}

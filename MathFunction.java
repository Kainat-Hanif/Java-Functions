import java.util.*;
public class MathFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
         System.out.println("Enter a decimal number: ");
         double a = s.nextDouble();
             System.out.println("The round of a is: " + Math.round(a));
             System.out.println("The floor of a is: " + Math.floor(a));
             System.out.println("The ceil of a is: " + Math.ceil(a));
             System.out.println("The square of a is: " + Math.sqrt(a));
             System.out.println("The log of a is: " + Math.log(a));
    }
    
}

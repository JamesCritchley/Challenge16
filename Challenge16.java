
package challenge16;
import java.util.Scanner;
import java.lang.Math;
public class Challenge16 {

    public static void main(String[] args) {
        System.out.println("Type in a number: ");
        Scanner sc = new Scanner (System. in);
        int num1 = sc.nextInt();
        System.out.println("Type in another number: ");
        int num2 = sc.nextInt ();
        
        System.out.println(num1 + " to the power of " + num2 + " is " + (Math.pow (num1, num2)));
    }
    
}

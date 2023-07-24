import java.util.Scanner;
import java.util.Stack;

/**
 * MardiGras - Main
 *
 * @author Carter Thiel
 */

public class Main {

    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);
        System.out.println("Enter numbers:");

        int n = mySc.nextInt();

        Stack<Integer> Alley = new Stack<>();
        Alley.push(null);

        int i = 1;
        int numInputs = 0;
        while (numInputs < n) {
            int val = mySc.nextInt();
            numInputs ++;
            if (val == i){
                i++;
            }
            else if (java.util.Objects.equals(Alley.peek(), i)) {
                Alley.pop();
                i++;
            }
            else if (val != i && !java.util.Objects.equals(Alley.peek(), i)) {
                Alley.push(val);
            }
        }

        while (java.util.Objects.equals(Alley.peek(), i)){
            Alley.pop();
            i++;
        }
        if (java.util.Objects.equals(Alley.peek(), null)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        }
    }
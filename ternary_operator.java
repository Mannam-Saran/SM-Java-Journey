import java.util.Scanner;

public class ternary_operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is: " + result);
    }
}

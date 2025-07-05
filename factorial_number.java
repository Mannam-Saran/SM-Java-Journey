import java.util.Scanner;

public class factorial_number {
    public static int factorial (int n) {
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("The n is a negative number, Factorial cnnot be determined");
        } else{
            System.out.println("The Factorial of "+ n + " is "+ factorial (n));
        }
    }
}

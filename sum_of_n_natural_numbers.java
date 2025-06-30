import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum of n natural numbers is: "+ sum);
    }
}

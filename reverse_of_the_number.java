import java.util.Scanner;

public class reverse_of_the_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int last_digit =0;
        while(n>0){
            last_digit= n%10;
            System.out.print(last_digit);
            n=n/10;
        }
    }
}



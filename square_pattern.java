import java.util.Scanner;

public class square_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        int n= sc.nextInt();
        for (int i=1; i<n+1; i++){
            System.out.println("****");
        }
    }
}

import java.util.Scanner;

public class product_of_numbers_using_functions {
    
    public static int multiply (int a, int b){
        int product = a*b;
        return product;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println("Product of " + a + " and " + b + " is: " + prod);
    }
    
}

import java.util.*;
public class evenorodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

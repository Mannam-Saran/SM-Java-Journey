import java.util.*;
public class incometaxcalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income= sc.nextInt();
        int tax=0;
        if (income < 500000){
            tax= 0;
            System.out.println("No tax to be paid");
        }
        else if (income >500000 && income <= 1000000) {
            tax= (int) (0.2 * (income));
            System.out.println("Tax to be paid is: " + tax);
        }
        else if (income > 1000000) {
            tax= (int) (0.3 * (income));
            System.out.println("Tax to be paid is: " + tax);
        }
        else {
            System.out.println("Invalid income");
        }
        int Total_tax= income- tax;
        System.out.println("Total income after tax is: " + Total_tax); 
    }
}

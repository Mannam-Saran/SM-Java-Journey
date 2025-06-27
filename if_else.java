import java.util.Scanner;

public class if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Age: ");
        int age = sc.nextInt();
        if (age >= 55) {
            System.out.println("Is an Senior citizen");
        }
        else if (age >=18 && age < 55) {
            System.out.println("Is an adult");
        }
        else if (age >=13 && age < 18) {
            System.out.println("Is a teenager");
        }
        else if (age >= 0 && age < 13) {
            System.out.println("Is a child");
        }
        else {
            System.out.println("Invalid age");

        }
    }
}

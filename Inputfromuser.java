import java.util.*;
public class Inputfromuser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + input + ", you are " + age + " years old.");
    }
    
}

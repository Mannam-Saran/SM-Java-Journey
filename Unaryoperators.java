public class Unaryoperators {
    public static void main(String[] args) {
        // Unary Operators
        int a = 10;
        int b = ++a;
        int c = 10;
        int d = c++;
        int e = 10;
        int f = --e;
        int g = 10;
        int h = g--;
        System.out.println("Original value: " + a);
        System.out.println("Pre Increment " + b);
        System.out.println("------------------------");
        System.out.println("Original value: " + c);
        System.out.println("Post Increment: " + d);
        System.out.println("------------------------");
        System.out.println("Original value: " + e);
        System.out.println("Pre Decrement: " + f);
        System.out.println("------------------------");
        System.out.println("Original value: " + g);
        System.out.println("Post Decrement: " + h);
    }
    
}

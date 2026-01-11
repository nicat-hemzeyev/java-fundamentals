public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Assignment operators
        int c = a;
        c += b;
        System.out.println("c after += b: " + c);

        // Increment/Decrement operators
        int d = 5;
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
    }
}


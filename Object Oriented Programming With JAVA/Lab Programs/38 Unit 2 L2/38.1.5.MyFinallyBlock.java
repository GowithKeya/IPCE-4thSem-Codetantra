//38.1.5 myfinallyblock.java
package q11330;

public class MyFinallyBlock {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        float x = Float.parseFloat(args[2]);
        float y = Float.parseFloat(args[3]);

        // 1st try-catch-finally: integer division
        try {
            int intResult = a / b;
            System.out.println("Result of integer values division : " + intResult);
        } catch (ArithmeticException e) {
            System.out.println("Inside the 1st catch block");
        } finally {
            System.out.println("Inside the 1st finally block");
        }

        // 2nd try-finally: float division (no exception for /0 with floats)
        try {
            float floatResult = x / y;
            System.out.println("Result of float values division : " + floatResult);
        } finally {
            System.out.println("Inside the 2nd finally block");
        }
    }
}
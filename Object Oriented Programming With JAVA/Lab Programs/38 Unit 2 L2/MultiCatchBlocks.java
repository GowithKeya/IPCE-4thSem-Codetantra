//38.1.6 multicatchblocks.java
package q11331;

public class MultiCatchBlocks {

    // Write the method as specified
    public void multiCatch(int[] arr, int index) {
        try {
            // Print the value at the given index
            System.out.println(arr[index]);
            // Print the division value of arr[index] by index
            System.out.println(arr[index] / index);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
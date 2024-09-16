package OOPS;
public class try_Catch {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 50; // This will throw ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
        finally{
        System.out.println("Program continues after exception handling.");
        }
    }
}

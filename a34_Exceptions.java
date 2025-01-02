public class a34_Exceptions {
    public static void main(String[] args) {

        int i = 3;
        int j = 18;
        int arr[] = new int[5];
        arr[1] = 10;
        String name = null;
        try {
            j = 18 / i;
            System.out.println(name.length());
            System.out.println(arr[1]);
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("Dividing By Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Out of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}

// Types of errors
// 1) Compile time Error -> Mistake in writing method name
// 2) Logical Error -> We made some error in logic
// 3) Runtime Error -> occurs while a program is running, causing it to crash or
// produce incorrect output

// Runtime errors are known as exceptions and we will try to solve them

// EXCEPTION HIERARCHY

// Throwable extends Object
// Error extends Throwable -> When Cant Handle Error
// Exception extends Throwable -> We Can Handle Exception
// RuntimeException extends Exception -> UNCHECKED EXPRESSION
// IoException extends Exception \ CHECKED EXPRESSION
// SQLexception extends Exception \ CHECKED EXPRESSION

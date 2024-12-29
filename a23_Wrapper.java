public class a23_Wrapper {
    public static void main(String[] args) {
        int num = 8;
        // Integer num = new Integer(num); // Boxing
        Integer num1 = num;
        Integer num2 = num; // Auto-Boxing

        int num3 = num1.intValue(); // Unboxing
        int num4 = num2; // Auto-Unboxing

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        // Convert String to Int
        String num5 = "55";
        int num6 = Integer.parseInt(num5) * 2;
        System.out.println(num6);
    }
}

// Boxing-> when primitive data type is assigned to reference variable
// Unboxing-> when reference variables value is assigned to primitive data type

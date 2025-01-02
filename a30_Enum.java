import java.util.Scanner;

enum a30 {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class a30_Enum {
    public static void main(String[] args) {

        // a30[] arr = a30.values();
        // for (a30 a : arr) {
        // System.out.println(a + " " + a.ordinal());
        // }

        Scanner Scanner = new Scanner(System.in);
        String res = Scanner.nextLine();

        try {
            a30 obj = a30.valueOf(res);
            switch (obj) {
                case Monday, Tuesday, Wednesday, Thursday, Friday -> System.out.println("It is a Weekday");
                case Sunday, Saturday -> System.out.println("It is a Weekend");

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Enter Valid Day");
        }

        Scanner.close();
    }
}

// A special kind of class that represents a fixed set of constants
// They improve code readibility and are easy to maintain
// More efficient with swicthes when comparing string
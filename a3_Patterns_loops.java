import java.util.Scanner;

public class a3_Patterns_loops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int lines = n;
        while (lines > 0) {
            // empty space
            for (int i = 0; i < lines - 1; i++) {
                System.out.print(" ");
            }
            for (int i = n - lines; i >= 0; i--) {
                System.out.print(i + 1);
            }

            for (int i = 0; i < n - lines; i++) {
                System.out.print(i + 2);
            }
            lines--;
            System.out.println();
        }

        myScanner.close();
    }

}

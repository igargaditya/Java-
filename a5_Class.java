import java.util.Scanner;

class a5_Calc {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class a5_Class {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        int num1 = myscanner.nextInt();
        int num2 = myscanner.nextInt();

        a5_Calc Calci = new a5_Calc();
        int result = Calci.add(num1, num2);
        System.out.println(result);
    }
}

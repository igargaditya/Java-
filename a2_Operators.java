public class a2_Operators {

    public static void main(String args[]) {

        // Arithmetic Operator
        int num = 47;
        int result1 = num++; // result 1 - 47 , num = 48

        int result2 = ++num; // result 2 - 49 , num = 49

        System.out.println(result1);
        System.out.println(result2);

        // Relational Operator

        int x = 5;
        int y = 6;
        boolean ans1 = x < y; // less than
        boolean ans2 = x <= y; // less than equal to
        boolean ans3 = x != y; // not equal to
        boolean ans4 = x == y; // equal to

        double a = (float) 98.33;
        float b = 98.33f;
        boolean ans5 = a == b;
        // If converted to float then ans yes else ans no as data type are different

        System.out.println(ans5);

        // Logical Operator

        boolean ans6 = 5 > 7 || 6 > 4;
        System.out.println(ans6);
    }
}

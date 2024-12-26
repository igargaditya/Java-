public class a4_Switch {
    public static void main(String[] args) {
        int num = 1;

        // 1st type switch without break statement
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Weekend");
        }

        num = 2;
        // Switch Statement as Expression
        String ans = "";

        ans = switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Weekend";
        };

        System.out.println(ans);
    }
}

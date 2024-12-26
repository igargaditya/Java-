class a1_Introduction {
    public static void main(String a[]) {
        System.out.println("First Program");
        System.out.println("We will Learn about data types : ");

        int num1 = 5; // 4 byte
        long num2 = 2147483649l; // Put l as int is default for anything ( 8 byte )
        num1 = (int) num2;
        short num3 = 255; // 2 byte
        byte num4 = 23; // 1 byte

        double num5 = 5544.333;
        float num6 = 554.34f;

        Boolean bool = true;

        // Converting type of char to byte
        char ch = 'A'; // 2 Byte
        byte eh = 1;
        eh = (byte) ch;
        System.out.println(eh);

        // Converting long to short
        long num7 = 2147483648l;
        short num8 = 3;
        num8 = (short) num7;
        short num9 = (short) 222222422222l;
        System.out.println(num8);
        System.out.println(num9);
    }
}
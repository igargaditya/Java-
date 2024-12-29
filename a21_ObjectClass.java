class a21 {
    String name;
    int price;

    public a21(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String toString() {
        return name + " : " + price;
    }
}

public class a21_ObjectClass {
    public static void main(String[] args) {
        a21 obj = new a21(2000, "MacBook");

        System.out.println(obj.toString());
        // Without even calling obj.toString() is called and hence we can override it

        // We can also implement methods like isequal and hashcode

    }
}

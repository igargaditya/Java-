class a25Outer {
    private int name;

    public static void display() {
        System.out.println("Printing");
    }

    class a25Inner {
        public void config() {
            System.out.println("In Config");
        }
    }
}

public class a25_InnerClass {
    public static void main(String[] args) {

        a25Outer.a25Inner object = new a25Outer().new a25Inner();
        a25Outer.display(); // Without making Object
        object.config();

    }
}

// When a class is present a class and we have to use it we use static keyword
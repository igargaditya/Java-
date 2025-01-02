abstract class a27 {
    public abstract void show();

    public abstract void show1();
}

// When we have only abstract methods in a class then we can use interface
interface a27interface {
    int age = 4;

    void show();

    void show1();

}

// Compulsory to define all methods of interface
class a27first implements a27interface {
    public void show() {
        System.out.println("In print");
    }

    public void show1() {
        System.out.println("In config");
    }
}

public class a27_Interface {
    public static void main(String[] args) {
        a27interface object;

        // As variable are static final hence we can print the age value directly and
        // cannot change it

        System.out.println(a27interface.age);

        // Cannot create an object of interface
        // 1st Method to use interface - Using anonymous class
        object = new a27interface() {
            public void show() {
                System.out.println("print");
            }

            public void show1() {

            }
        };

        // Using Another class
        object = new a27first();
        object.show();
    }
}

// Interface - When abstract class with only abstract methods
// All methods in interface are public abstract
// All variable in interface are final and static
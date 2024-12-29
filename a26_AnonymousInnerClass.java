class a26 {
    public void show() {
        System.out.println("In A Show");
    }
}

abstract class a26abstract {
    public abstract void show();

    public void rant() {
        System.out.println("Ranting");
    }
}

public class a26_AnonymousInnerClass {
    public static void main(String[] args) {
        a26 object1 = new a26() {
            public void show() {
                System.out.println("In New Show");
            }
        };
        object1.show();

        a26abstract object2 = new a26abstract() {
            public void show() {
                System.out.println("In New Show");
            }

            public void rant() {
                System.out.println("Not Ranting Now!!");
            }
        };
        object2.show();
        object2.rant();
    }
}

// Overwriting a method without using method overriding technique is known as
// Anonymous Inner Class
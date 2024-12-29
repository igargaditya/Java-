class a22parent {
    public void show1() {
        System.out.println("In Parent");
    }
}

class a22child extends a22parent {
    public void show() {
        System.out.println("In Child");
    }
}

public class a22_Up_Down_Cast {
    public static void main(String[] args) {

        // UPCASTING
        a22parent obj = (a22parent) new a22child(); // Yes we can do this
        obj.show1();

        // DOWNCASTING
        a22child obj2 = (a22child) obj;
        obj2.show();
    }
}

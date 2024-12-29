import a18packages.*;

class a18first {
    public int temp1 = 4;
    private int temp2 = 5;
    protected int temp3 = 6;
    int temp4 = 7;

    public void print() {
        System.out.println(temp1 + " Public");
        System.out.println(temp2 + " Private");
        System.out.println(temp3 + " Protected");
        System.out.println(temp4 + " Default");
    }

}

class a18second extends a18first {

    public void print() {
        System.out.println(temp1 + " Public");
        // System.out.println(temp2 + " Private"); // Not accesible
        System.out.println(temp3 + " Protected");
        System.out.println(temp4 + " Default");
    }
}

class a18third extends a18 {
    public void print() {
        System.out.println(temp1 + " Public");
        // System.out.println(temp2 + " Private");
        System.out.println(temp3 + " Protected");
        // System.out.println(temp4 + " Default");
    }
}

public class a18_Access {
    public static void main(String[] args) {

        System.out.println("IN SAME CLASS ");
        a18first obj1 = new a18first();
        obj1.print(); // Every thing is printed hence in same class everything accessible

        System.out.println("IN SAME PACKAGE BUT SUBCLASS");
        a18second obj2 = new a18second();
        obj2.print();

        System.out.println("IN SAME PACKAGE BUT NOT SUBCLASS ");
        a18first obj3 = new a18first();
        System.out.println(obj3.temp1 + " PUBLIC");
        // System.out.println(obj3.temp2 + "PRIAVATE"); // NOT ACESSIBLE
        System.out.println(obj3.temp3 + " PROTECTED");
        System.out.println(obj3.temp4 + " DEFAULT");

        System.out.println("IN DIFFERENT PACKAGE BUT SUBCLASS ");
        a18third obj4 = new a18third();
        obj4.print();

        System.out.println("IN DIFFERENT PACKAGE BUT NOT SUBCLASS");
        a18 obj5 = new a18();
        System.out.println(obj5.temp1 + " PUBLIC");
        // System.out.println(obj5.temp2 + "PRIAVATE"); // NOT ACCESSIBLE
        // System.out.println(obj5.temp3 + " PROTECTED"); // NOT ACCESSIBLE
        // System.out.println(obj5.temp4 + " DEFAULT"); // ACCESSIBLE

    }
}

// PUBLIC PRIVATE PROTECTED DEFAULT
// Same class Yes Yes Yes Yes
// Same package subclass Yes No Yes Yes
// Same package nonsubclass Yes No Yes Yes
// Diff package Subclass Yes No Yes No
// Diff package nonsubclass Yes No No No
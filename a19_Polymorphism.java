class a19first {
    public void show() {
        System.out.println("In First");
    }
}

class a19second extends a19first {
    public void show() {
        System.out.println("In Second");
    }
}

class a19third extends a19second {
    public void show() {
        System.out.println("In Third");
    }
}

public class a19_Polymorphism {
    public static void main(String[] args) {

        a19first obj = new a19first();
        obj.show(); // IN FIRST

        obj = new a19second();
        obj.show(); // IN SECOND

        obj = new a19third();
        obj.show(); // IN THIRD

    }
}

// TYPES OF POLYMORPHISM
// 1) Compile time (early binding) - > Method overloading
// 2) Runtime (late bidning) - > Method overriding

// Dynamic method is a run time polymorphism
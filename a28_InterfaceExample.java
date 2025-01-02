interface a28Computer {
    void print();
}

class a28Desktop implements a28Computer {
    public void print() {
        System.out.println("Code,complile,run,Faster");
    }
}

class a28Laptop implements a28Computer {
    public void print() {
        System.out.println("Code,compile,run");
    }
}

class a28Dev {
    public void devapp(a28Computer cmp) {
        cmp.print();
    }
}

public class a28_InterfaceExample {
    public static void main(String[] args) {
        a28Computer lap = new a28Laptop();
        a28Computer desk = new a28Desktop();

        a28Dev garg = new a28Dev();
        garg.devapp(lap);

    }
}

// Abstract Class with all abstract method - > Interface
// Class to class inheritance -> Extends
// Interface to class inheritance -> Implements

// A class can implements multiple interface

// TYPES OF INTERFACE
// 1) Normal Interface -> Two or More Methods
// 2) Functional/Single abstract method -> Single Method
// 3) Marker Interface -> No Method

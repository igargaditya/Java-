interface a29A {
    void method1();

    void method2();

    int num1 = 9;
}

interface a29B {
    void method3();

    void method1();
}

interface a29C extends a29A, a29B {

}

class a29D implements a29C {
    public void method1() {
        System.out.println("In A and B interface");
    }

    public void method2() {
        System.out.println("In A Interface");
    }

    public void method3() {
        System.out.println("In B interface");
    }

}

public class a29_InterfacePrac {
    public static void main(String[] args) {
        // Creating reference to A interface
        a29A obj1 = new a29D();
        obj1.method1();
        obj1.method2();
        // obj1.method3(); // error as A interface doesnt know about B interface

        a29B obj2 = new a29D();
        obj2.method1();
        // obj2.method2(); // error as B interface doesnt know about A interface
        obj2.method3();

        a29C obj3 = new a29D();
        obj3.method1();
        obj3.method2();
        obj3.method3();

    }
}

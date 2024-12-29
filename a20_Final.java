class a20 {
    public final void show() {
        System.out.println("In Calc");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class a20_Extending extends a20 {
    // public void show(){
    // // ERROR AS SHOW IN PARENT CLASS IS FINAL
    // }

}

public class a20_Final {
    public static void main(String[] args) {
        final int n = 10; // now cant change the value
        System.out.println(n);
    }
}

// Final Variable - Cant be change and hence making constant
// Final Class - We cant inherit the class
// Final Method - We cant override method in child class

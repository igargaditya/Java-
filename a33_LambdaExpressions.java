@FunctionalInterface
interface a33first {
    void f1();
}

@FunctionalInterface
interface a33second {
    void f2(int i);
}

@FunctionalInterface
interface a33third {
    int add(int i, int j);
}

public class a33_LambdaExpressions {
    public static void main(String[] args) {

        // First Method (When Return type is void )
        a33first obj1 = new a33first() {
            public void f1() {
                System.out.println("Implemented by Inner class");
            }
        };
        // Second Method (When Return type is void)
        a33first obj2 = () -> System.out.println("By Lambda Expression");

        // (When we have params in void return type)
        a33second obj3 = (i) -> System.out.println("By Lambda Expression with params");

        obj1.f1();
        obj2.f1();
        obj3.f2(5);

        // First Method (When Return type is not void)
        a33third obj4 = new a33third() {
            public int add(int i, int j) {
                System.out.println("By Inner Class");
                return i + j;
            }
        };

        int result1 = obj4.add(3, 8);
        System.out.println(result1);

        // Second Method

        a33third obj5 = (int i, int j) -> {
            System.out.println("By Lambda Expression");
            return i + j;
        };
        int result2 = obj5.add(4, 9);
        System.out.println(result2);

    }
}

// Lambda Expression is used to shorten the code significantly and works on
// functional interfaces
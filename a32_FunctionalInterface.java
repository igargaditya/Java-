
@FunctionalInterface // This is an annotation
interface a32 {
    void show();

}

public class a32_FunctionalInterface {
    public static void main(String[] args) {
        a32 obj = new a32() {
            public void show() {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}

// Annotations are used to provide supplemental information about a program.
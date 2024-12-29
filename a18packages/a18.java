package a18packages;

public class a18 {
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

class a17parent{
    public void show(){
        System.out.println("In A");
    }
    public void config(){
        System.out.println("In a Config");
    }
    
}

class a17child extends a17parent{
    public void show(){
        System.out.println("In B");
    }
}

public class a17_Method_Overriding{
    public static void main(String arg[]){
        a17child a1 = new a17child();
        a1.show();
        a1.config();
    }
}

// We can override the methods in derived class
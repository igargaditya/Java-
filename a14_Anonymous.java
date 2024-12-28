class a14{
    public a14(){
        System.out.println("Constructor Called"); 
    }
    public void show(){
        System.out.println("Show Method used") ; 
    }
}

public class a14_Anonymous{
    public static void main(String arg[]){

        a14 a1 = new a14() ;     // a1 is reference variable and the object is created in heap 
        new a14() ; 
        new a14().show() ;
    }
}

// Anonymous Objects
// Objects can be created in heap without the use of making a reference variable
// But These objects can be used only once and cannot be reused again and again 

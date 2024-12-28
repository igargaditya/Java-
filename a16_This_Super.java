class a16parent{
    
    public a16parent(){
        super();
        System.out.println("Parent Default Constructor");
    }
    public a16parent(int n){
        super();
        System.out.println("Parent Paramterized Constructor");
    }

    
}

class a16child extends a16parent{
    public a16child(){
        this(4);
        System.out.println("Child Default Constructor");
    }
    public a16child(int n){
        super(n);
        System.out.println("Child Paramterized Constructor");
    }
}


public class a16_This_Super{
    public static void main(String arg[]){
        a16child a1 = new a16child() ;  
        a16child a2 = new a16child(5); 
        
    }
}


// Super method executes constructor of parent class
// This method exectures constructor of same class
// Every class even if we dont mention it EXTENDS Object class 
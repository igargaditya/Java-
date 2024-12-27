class a13{
    private String name ; 
    private int age ; 

    // DEFAULT CONSTRUCTOR 
    public a13(){
        age = 12 ; 
        name = "xyz" ; 
    }
    // PARAMETERIZED CONSTRUCTOR 
    public a13(int age,String name){
        this.name = name ; 
        this.age = age ; 
    }
    
    public a13(a13 obj){
        this.name = obj.name ; 
        this.age = obj.age ; 
    }

    public void print(){
        System.out.println(name+":"+age);
    }

}

public class a13_Constructor{
    public static void main(String a[]){

        // Paramterized Used 
        a13 a1 = new a13(18,"Aditya");

        // Default Used
        a13 a2 = new a13(); 

        // Copy Constructor used 
        a13 a3 = a2; 
        
        a1.print();
        a2.print();
        a3.print();
        
    }
}
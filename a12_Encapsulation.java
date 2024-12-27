class a12_Human{
    private int age  ; 
    private String name ;
    public a12_Human(){

    }
    public a12_Human(String name,int age){
        this.name = name ; 
        this.age = age ; 
    }

    public void setAge(int age){
        this.age = age ; 
    }
    public void setName(String name){
        this.name = name ; 
    }
    public int getAge(){
        return age ; 
    }
    public String getName(){
        return name ; 
    }

}


public class a12_Encapsulation{
    public static void main(String args[]){
        a12_Human h1 = new a12_Human("Aditya",22) ; 
        a12_Human h2 = new a12_Human();
        h2.setName("xyz") ; 
        h2.setAge(21) ; 

        System.out.println(h2.getName());
      
    }
}


// Encapsulation 
// Binding our data with methods and only way to access them is using methods so no one is able to use data directly 

// This keyword is used to access the object inside its class when methods called
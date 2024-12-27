class a11_Phone{
    String name ; 
    int value ; 
    static String catg ; 

    static{
        catg = "Smartphone" ; 
        System.out.println("This is called first->This is the Static method when loaded first time");

    }
    public a11_Phone(String name,int value,String catg){
        System.out.println("Constructor Called") ; 
        this.name = name ; 
        this.value = value ; 
        this.catg = catg;
    }
    public void showdetails(){
        System.out.println(this.name+" : " + this.value + " : " + this.catg) ; 
    }

    public static void showdetails1(a11_Phone phone){
        System.out.println("This is static method") ; 
      //  System.out.println(this.name) ; // ERROR 

         System.out.println(phone.name+" -> " + phone.value + "-> " + catg);
         
    }
}

public class a11_Static{
    public static void main(String args[]) throws ClassNotFoundException{


      Class.forName("a11_Phone"); // Loads the class if not object created 

       // intialize the static member of the class 
       // This loads the class into the class loader and names catg -> bleh 
        a11_Phone.catg = "Bleh";

        a11_Phone p1 = new a11_Phone("Apple",1000,"Smartphone");   // static varible changed to smartphone
        a11_Phone p2 = new a11_Phone("Samsung",500,"Smartphone");

        

        p1.showdetails();
        p2.showdetails();
      //  a11_Phone.showdetails() ; // cannot make static reference to a non static method 
        a11_Phone.showdetails1(p1) ; 

    }
}

// Static Variable 
// Is used by all the objects of the class 
// Resides in different area in the jvm apart from stack and heap  
// use static variable in non static methods

// Static Method
// Non static members cannot be used in static method as we do not which object it is referring to 
// Can be used by passing the obj as parameter
// Main is static as we can execute it without making an object of that class directly and hence no deadlock


// Static Block 
// when an class is loaded for the first time then static block is also ran for execution  
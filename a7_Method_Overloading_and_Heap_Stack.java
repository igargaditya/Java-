class a7_calci{

    int num = 19 ;  // Instance variable 

    // When parameter change and does not work if return type different 
    public int add(int num1,int num2){
        return num1+num2 ;  // local variable 
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3 ; 
    }
}


public class a7_Method_Overloading_and_Heap_Stack{

    public static void main(String args[]){
        int a = 98 ; 
        a7_calci calc1 = new a7_calci();    // Calc1 is a reference variable and not object 
        a7_calci calc2 = new a7_calci() ; 
        System.out.println(calc1.add(2,3));
        System.out.println(calc1.add(2,3,5));

        calc1.num = 20 ; 

        System.out.println(calc1.num); 
        System.out.println(calc2.num);  // different object 

    }
}


// Stack and heap memory

// Stack1 - > main stack =  a -> 98 , add(2,3) - > 5 , add(2,3,5) -> 10 , 
        //                  calci -> inside heap memory and address to it 
// Stack2 - > add(2,3) = num1 -> 2 , num2->3 
// Stack3 - > add(2,3,5) = num1->2 , num2->3 , num3->5  

// heap memory = add() , add() , num -> 19 
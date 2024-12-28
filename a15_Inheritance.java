
class a15_Calc{
    public int add(int n1,int n2){
        return n1+n2 ; 
    }
    public int sub(int n1,int n2){
        return n1-n2 ; 
    }
}

class a15_AdvCalc extends a15_Calc{
    public int multi(int n1,int n2){
        return n1*n2 ; 
    }
    public int divide(int n1,int n2){
        return n1/n2 ; 
    }
}
class a15_VeryAdvCalc extends a15_AdvCalc{
    public int power(int n1,int n2){
        return (int)Math.pow(n1,n2);
    }
}


public class a15_Inheritance{
    public static void main(String args[]){
        a15_Calc obj1 = new a15_Calc(); 
        int r1 = obj1.add(5,4);
        int r2 = obj1.sub(5,4);

        a15_AdvCalc obj2 = new a15_AdvCalc() ; 
        int r3 = obj2.add(5,4);
        int r4 = obj2.sub(5,4);
        int r5 = obj2.divide(5,4);
        int r6 = obj2.multi(5,4);


        a15_VeryAdvCalc obj3 = new a15_VeryAdvCalc() ; 
        int r7 = obj3.add(5,4);
        int r8 = obj3.multi(3,5);
        int r9 = obj3.power(3,4);


       System.out.println(r3+" "+r4+" "+r5+" "+r6+" "+r7+" "+r8+" "+r9);
    }
}

// Calc is      Parent class , Superclass , Base Class 
// AdvCalc is   Child class ,  Subclass   , Derived Class
// Extend keyword is used to inherit from parent class in the child class


// IN ABOVE EXAMPLE 

// Calc - > AdvCalc ( single level Inheritance) 
// AdvCalc - > VeryAdvCalc ( Multilevel Inheritance )


// JAVA DOES NOT SUPPORT MUTIPLE INHERTIANCE
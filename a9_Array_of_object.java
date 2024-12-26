
class a9_Student{
    String name ; 
    int marks ; 
    int rollno ; 
    public a9_Student(String name,int marks,int rollno){
        this.name = name ; 
        this.marks = marks ; 
        this.rollno = rollno ; 
    }
}

public class a9_Array_of_object{
    public static void main(String arg[]){
       a9_Student s1 = new a9_Student("Aditya",89,47);
       a9_Student s2 = new a9_Student("xyz",95,46);

       a9_Student s[] = new a9_Student[2]; // DOES NOT CREATE ANY INSTANCE LIKE ARRAY 
       s[0]=s1 ; 
       s[1]=s2 ; 
 


       for(a9_Student stud: s){
        System.out.println(stud.name);
       }

    }
}
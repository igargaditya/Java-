public class a10_Strings{ 
    public static void main(String arg[]){
        String name1 = "Aditya" ; 
        String name2 = new String("Aditya"); 
        System.out.println(name2+" Hello");

        String name3 = "issame"; 
        String name4 = "issame"; // They are on same string constant pool and hence 1 object created 

        System.out.println(name3==name4);
        name1 = "Aditya" + " Garg" ; // Another obejct created and intial for garbage collection 


       StringBuffer name5 = new StringBuffer("Aditya");
       name5.append(" Garg");
         System.out.print(name5);

    }
}
 
// All string are stored in string constant pool and values are checked there for its existence

// Immutuable Strings - Strings once created cant be changed
// Can be created Using Classes such as String Buffer and String Builder

// String Buffer is thread safe and String Builder is not thread Safe 
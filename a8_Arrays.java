public class a8_Arrays {
    public static void main(String[] args) {


// 1D ARAAYS 
        // Static Array 
        int nums1[] = { 1, 2, 3, 4 };
        nums1[0]=100 ; 
        System.out.println(nums1[0]);

        // Dynamic Array 
        int nums[] = new int[4];   // All values are zero 
        nums[1]=20 ; 
        nums[2]=30 ; 
        nums[3]=40 ; 
        System.out.println(nums[1]);

        // Printing 

        for(int i=0 ; i<nums.length ; i++){    // Printing nums.size() not as same as C++ 
            System.out.println(nums[i]);
        }

// 2D ARRAYS 

       int nums2d[][] = new int[3][4];     // 3 arrays of 4 size 
  
       System.out.println("Way of printing 2D Array" );
       for(int i=0 ; i<nums2d.length ; i++){
        for(int j=0 ; j<nums2d[0].length ; j++){
            nums2d[i][j] = (int)(Math.random()*10);
            System.out.print(nums2d[i][j] + " "); 
         }
         System.out.println();
       }

       
      System.out.println("Another way of printing" );
       for(int n[] : nums2d){
        for(int  m : n){
            System.out.print(m+" ") ; 
        }
        System.out.println();
       }


// JAGGED ARRAYS (2d with not columns fixed)

      int jagged[][] = new int[3][] ; 

      jagged[0] = new int[3];
      jagged[1] = new int[4];
      jagged[2] = new int[2]; 
 
     System.out.println("Printing Jagged Array" );
     for(int m[] : jagged){
        for(int n: m){
            n=(int)(Math.random()*10); 
            System.out.print(n+" ");
        }
        System.out.println();
     }
    }
}


// If printing out of bound index then runtime error 
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	
    // public static int binarySearch(int a[], int num)
    // {
    //     if(num>a[a.length-1]||num<a[0])return -1;
    //     int start=0;
    //     int end =a.length-1;
    //     int mid=(start+end)/2;
    //     while(a[mid]!=num){
    //         if(num<mid){
    //             end=mid;
    //         }else{
    //             start=mid;
    //         }
    //         mid = (start+end)/2;
    //     }
    //     return mid;
    // }
        
    public static boolean binarySearch_new(int arr[], int n){
        // Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid = low+high/2;
            
            if(arr[mid]==n){
                return true;
            }
            if(n<arr[mid]){
                high=mid-1;
            }
            if(n>arr[mid]){
                low=mid+1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        // System.out.println(binarySearch(arr,40));
        System.out.println(binarySearch_new(arr,40));
        
    }

}


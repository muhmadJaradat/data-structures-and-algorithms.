package challenges.arrayBinarySearch;


public class BinarySearch {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6,7,8};
        int[] list2 = {1,4,7,11,15,19,25};
        

        int[] empty={} ;

        int num1 = 9;
        int num2 = 11;
        

        System.out.println("9 is not in the array and should give : " + binarySearch(list1, num1));

        System.out.println("11 is in the array and it was found at index : " + binarySearch(list2, num2));

       
        System.out.println("Empty array should give : " + binarySearch(empty,num1 ));
        
    }
    public static int binarySearch(int[] arr,int num){
 if(arr.length==0|| arr==null){return -1;}
 int highRange=arr.length-1;
 int firstRange=0;
 int midRange;
 while(firstRange<=highRange){
     midRange=(highRange+firstRange)/2;
     if(arr[midRange]<num){
         firstRange=midRange+1;
     }
     else if(arr[midRange]>num){
         highRange=midRange-1;
     }
     else{
         return midRange;
     }
 }
 return -1;

    }
}

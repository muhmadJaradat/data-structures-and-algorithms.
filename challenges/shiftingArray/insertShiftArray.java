package challenges.shiftingArray;

import java.util.Arrays;

public class insertShiftArray {
 static int[] testArr={1,2,3,4,5};
   
    public static void main(String[] args) {
 insertShiftArray(testArr, 10);
 
    }
    public static  void insertShiftArray(int[] arr,int num){
int[] newArr=new int[arr.length+1];
for(int i=0;i<newArr.length;i++){
    if(arr.length%2==0){
        newArr[i]= i<arr.length/2?arr[i]:i==arr.length/2?num:arr[i-1];
    }
  else{
    newArr[i]= i<arr.length/2+1?arr[i]:i==arr.length/2+1?num:arr[i-1];
  }
}
System.out.println("old Array: "+Arrays.toString(arr));
System.out.println("new Array: "+Arrays.toString(newArr));
    }
}

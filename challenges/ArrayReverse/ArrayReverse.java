package challenges.ArrayReverse;

import java.util.Arrays;

public class ArrayReverse {
    public static void main (String[]args)
    {
      int[] numbers = { 1, 2, 3 };
      Reverse(numbers);
     
    }
    public static void Reverse(int[] arr){
        int[] newArr;
        newArr = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--)
          {
     newArr[index] = arr[i];
     index++;
  
          }
          System.out.println (Arrays.toString(newArr));
    }
}


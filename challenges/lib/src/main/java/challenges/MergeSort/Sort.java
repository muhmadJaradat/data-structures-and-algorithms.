package challenges.MergeSort;

public class Sort {

    public int[] mergeSort(int[] arr){
        if (arr.length>1){
            int min=arr.length/2;
            int[] left;
            int[] right;
            right=new int[min];
            if (arr.length%2==0){
                left=new int[min];
                System.arraycopy(arr, min, right, 0, right.length );
            }
            else {
                left=new int[min+1];
                System.arraycopy(arr, min+1, right, 0, right.length );
            }

            System.arraycopy(arr, 0, left, 0, left.length );

            mergeSort(left);
            mergeSort(right);
            merge(left,right,arr);


        }
        return arr;
    }
    public void merge(int[] left,int[] right,int[] arr){
int i=0;
int j=0;
int k=0;

while (i<left.length&&j<right.length){
    if (left[i]<=right[j]){
        arr[k]=left[i];
        i++;
    }
    else {
        arr[k]=right[j];
        j++;
    }
    k++;
}
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
}

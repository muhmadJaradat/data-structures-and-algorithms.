package challenges.QuickSortTest;

import challenges.MergeSort.Sort;
import challenges.QuickSort.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class QuickSortTest {
    @Test
    void mergeSortTest(){
        QuickSort sort=new QuickSort();

        //First Test
        int[] arr={20,18,12,8,5,-2};
        int[] expectedArr={-2,5,8,12,18,20};
        sort.quickSort(arr,0,arr.length-1);
        assertArrayEquals(expectedArr,arr);

        //Second Test
        arr= new int[]{5, 12, 7, 5, 5, 7};
        expectedArr=new int[] {5,5,5,7,7,12};
        sort.quickSort(arr,0,arr.length-1);
        assertArrayEquals(expectedArr,arr);

        //Third Test
        arr=new int[]{2,3,5,7,13,11};
        expectedArr=new int[]{2,3,5,7,11,13};
        sort.quickSort(arr,0,arr.length-1);
        assertArrayEquals(expectedArr,arr);
    }
}


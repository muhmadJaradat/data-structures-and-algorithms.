package challenges.MergeSort;

import challenges.SelectionSort.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    void mergeSortTest(){
        Sort sort=new Sort();

        //First Test
        int[] arr={20,18,12,8,5,-2};
        int[] expectedArr={-2,5,8,12,18,20};
        assertArrayEquals(expectedArr,sort.mergeSort(arr));

        //Second Test
        arr= new int[]{5, 12, 7, 5, 5, 7};
        expectedArr=new int[] {5,5,5,7,7,12};
        assertArrayEquals(expectedArr,sort.mergeSort(arr));

        //Third Test
        arr=new int[]{2,3,5,7,13,11};
        expectedArr=new int[]{2,3,5,7,11,13};
        assertArrayEquals(expectedArr,sort.mergeSort(arr));
    }
}

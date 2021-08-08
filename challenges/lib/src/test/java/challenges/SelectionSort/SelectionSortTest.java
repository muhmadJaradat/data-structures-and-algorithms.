package challenges.SelectionSort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test void sortTest(){
  SelectionSort selectionSort=new SelectionSort();

  //First Test
  int[] arr={20,18,12,8,5,-2};
  int[] expectedArr={-2,5,8,12,18,20};
  assertArrayEquals(expectedArr,selectionSort.sort(arr));

  //Second Test
      arr= new int[]{5, 12, 7, 5, 5, 7};
      expectedArr=new int[] {5,5,5,7,7,12};
      assertArrayEquals(expectedArr,selectionSort.sort(arr));

      //Third Test
      arr=new int[]{2,3,5,7,13,11};
      expectedArr=new int[]{2,3,5,7,11,13};
      assertArrayEquals(expectedArr,selectionSort.sort(arr));
    }
}

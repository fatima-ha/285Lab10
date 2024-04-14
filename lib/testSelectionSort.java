

import org.junit.*;

public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
/** add tests to check for this unit test **/
}
    @Test
    public void testNegative(){
/** Test data contains negative values only **/

        int[] arr = {-1, -3, -2, -5, -4};
        int[] expected = {-5, -4, -3, -2, -1};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals(expected, actual);

    }

    public void testMixed() {
        
        int[] arr = {0, -1, 1, -10, 10};
        int[] expected = {-10, -1, 0, 1, 10};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals(expected, actual);
    }  
  /** Test data contains with both positive, negative and zeros **/

    public void testDuplicates(){
            /** Test data contains duplicates **/

        int[] arr = {5, -1, 2, -1, 5};
        int[] expected = {-1, -1, 2, 5, 5};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals(expected, actual);
    }

    }
 


import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void testPositive() {
<<<<<<< HEAD
        // Updated array with different positive numbers
=======
        // Array with positive numbers
>>>>>>> testMixedandtestDuplicate
        int[] arr = {34, 21, 45, 32, 15};
        int[] expected = {15, 21, 32, 34, 45};  // Expected sorted array
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Positive numbers sorting failed", expected, actual);
    }

    @Test
    public void testNegative() {
<<<<<<< HEAD
        // Updated array with a different set of negative numbers
=======
        // Array with negative numbers
>>>>>>> testMixedandtestDuplicate
        int[] arr = {-34, -21, -45, -32, -15};
        int[] expected = {-45, -34, -32, -21, -15};  // Expected sorted array
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Negative numbers sorting failed", expected, actual);
    }

    @Test
    public void testMixed() {
<<<<<<< HEAD
        int[] arr = {0, -1, 1, -10, 10};
        int[] expected = {-10, -1, 0, 1, 10};
=======
        // New array with a mix of positive, negative numbers, and zeros
        int[] arr = {3, -2, 0, -1, 2};
        int[] expected = {-2, -1, 0, 2, 3};
>>>>>>> testMixedandtestDuplicate
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Mixed numbers sorting failed", expected, actual);
    }

    @Test
    public void testDuplicates() {
<<<<<<< HEAD
        int[] arr = {5, -1, 2, -1, 5};
        int[] expected = {-1, -1, 2, 5, 5};
=======
        // New array with duplicates of positive and negative numbers
        int[] arr = {7, -3, 7, -3, 0};
        int[] expected = {-3, -3, 0, 7, 7};
>>>>>>> testMixedandtestDuplicate
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Duplicate numbers sorting failed", expected, actual);
    }
}
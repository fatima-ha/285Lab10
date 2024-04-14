import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void testPositive() {
        // Array with positive numbers
        int[] arr = {34, 21, 45, 32, 15};
        int[] expected = {15, 21, 32, 34, 45};  // Expected sorted array
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Positive numbers sorting failed", expected, actual);
    }

    @Test
    public void testNegative() {
        // Array with negative numbers
        int[] arr = {-34, -21, -45, -32, -15};
        int[] expected = {-45, -34, -32, -21, -15};  // Expected sorted array
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Negative numbers sorting failed", expected, actual);
    }

    @Test
    public void testMixed() {
        // New array with a mix of positive, negative numbers, and zeros
        int[] arr = {3, -2, 0, -1, 2};
        int[] expected = {-2, -1, 0, 2, 3};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Mixed numbers sorting failed", expected, actual);
    }

    @Test
    public void testDuplicates() {
        // New array with duplicates of positive and negative numbers
        int[] arr = {7, -3, 7, -3, 0};
        int[] expected = {-3, -3, 0, 7, 7};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Duplicate numbers sorting failed", expected, actual);
    }
}
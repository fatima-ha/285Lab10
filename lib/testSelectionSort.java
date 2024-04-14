import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void testPositive() {
        // Updated array with different positive numbers
        int[] arr = {34, 21, 45, 32, 15};
        int[] expected = {15, 21, 32, 34, 45};  // Expected sorted array
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Positive numbers sorting failed", expected, actual);
    }

    @Test
    public void testNegative() {
        // Updated array with a different set of negative numbers
        int[] arr = {-34, -21, -45, -32, -15};
        int[] expected = {-45, -34, -32, -21, -15};  // Expected sorted array
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Negative numbers sorting failed", expected, actual);
    }

    @Test
    public void testMixed() {
        int[] arr = {0, -1, 1, -10, 10};
        int[] expected = {-10, -1, 0, 1, 10};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Mixed numbers sorting failed", expected, actual);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {5, -1, 2, -1, 5};
        int[] expected = {-1, -1, 2, 5, 5};
        SelectionSort sorter = new SelectionSort();
        int[] actual = sorter.basicSelectionSort(arr);
        Assert.assertArrayEquals("Duplicate numbers sorting failed", expected, actual);
    }
}
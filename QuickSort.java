import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (right > left) {
            int pivotIndex = left + (right - left) / 2;
            int newPivotIndex = partition(nums, left, right, pivotIndex);
            quickSort(nums, left, newPivotIndex - 1);
            quickSort(nums, newPivotIndex + 1, right);
        }
    }

    private static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivotValue = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i <= right - 1; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, storeIndex);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {78, 4, 1, 5, 2, 7, 3, 0, -8};
        QuickSort.quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
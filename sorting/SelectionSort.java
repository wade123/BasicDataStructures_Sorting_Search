import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }

            }
            if (min != i) {
                swap(nums, i, min);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 1, 2};
        SelectionSort.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
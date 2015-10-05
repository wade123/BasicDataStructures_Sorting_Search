import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] nums) {
        int[] helper = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, helper);
    }

    private static void mergeSort(int[] nums, int left,
        int right, int[] helper) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid, helper);
            mergeSort(nums, mid + 1, right, helper);
            merge(nums, left, mid, right, helper);
        }
    }

    private static void merge(int[] nums, int left, int mid,
        int right, int[] helper) {
        for (int i = left; i <= right; i++) {
            helper[i] = nums[i];
        }
        int one = left;
        int two = mid + 1;
        int cur = left;
        while (one <= mid && two <= right) {
            if (helper[one] < helper[two]) {
                nums[cur++] = helper[one++]; 
            } else {
                nums[cur++] = helper[two++];
            }
        }
        while (one <= mid) {
            nums[cur++] = helper[one++];
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 100, 3, 2, 5, 19, 0, -2};
        MergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
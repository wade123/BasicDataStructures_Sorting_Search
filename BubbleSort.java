import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
    	int length = nums.length;
    	for (int i = 0; i < length - 1; i++) {
    		for (int j = 0; j < length - 1 - i; j++) {
    			if (nums[j] > nums[j + 1]) {
    				swap(nums, j, j + 1);
    			}
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
    	BubbleSort.bubbleSort(nums);
    	System.out.println(Arrays.toString(nums));
    }
}
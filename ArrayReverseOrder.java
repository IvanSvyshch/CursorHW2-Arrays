package CursorHomeWork.HW2Array;

// Create next array of Integers with values: 2,3,1,7,11.
// Sort them by DESC(reverseOrder).

import java.util.Arrays;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 7, 11};
        Arrays.sort(nums);

        System.out.println("Array Reverse Order");
        for (int i = nums.length - 1; i >= 0; i--)
            System.out.print(" " + nums[i]);
    }
}

package CursorHomeWork.HW2Array;

// Create next array of Integers with values: 2,3,1,7,11.
// Sort them by DESC(reverseOrder).

public class array_reverse_order {
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 7, 11};
        int a, b, t;
        int size;

        size = 5;

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {

                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Array Reverse Order");
        for (int i = size - 1; i >= 0; i--)
            System.out.print(" " + nums[i]);
    }
}


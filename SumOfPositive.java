package CursorHomeWork.HW2Array;

//You get an array of numbers(should contain both positive and negative numbers),
// and return the sum of all the positive ones.
// (If there are nothing to sum, sum should be 0)

public class SumOfPositive {
    public static void main(String[] args) {

        int[] value = new int[]{8, 3, 22, -10, -2, 14, 15};
        int sum = 0;

        for (int i : value) {
            if (value.length == 0) {
                System.out.println(sum);
            } else if (i > 0) {
                sum = i + 1;
            }
        }
        System.out.println(sum);
    }
}

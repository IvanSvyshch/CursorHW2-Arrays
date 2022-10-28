package CursorHomeWork.HW2Array;

//You get an array of numbers, return the average of a list of numbers in this array.
// (Example -  array{1,2,4,1} -> avg = 2)

public class return_the_average_array {
    public static void main(String[] args) {

        int[] mas = new int[]{8, 6, 22, 5, 33};
        int value = 0;
        for (int i : mas) {
            value = i + i;
        }
        System.out.println((double) value / mas.length);
    }
}


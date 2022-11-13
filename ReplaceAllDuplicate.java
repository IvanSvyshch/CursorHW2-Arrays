package CursorHomeWork.HW2Array;

//You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0.
// Result should be  next: {3,2,0,1,4,0,8,0}

public class ReplaceAllDuplicate {
    public static void main(String[] args) {

        int [] value = new int [] {2, 3, 3, 5, 4, 4, 7, 7};

        for (int i = 0; i < value.length; i++){
            for (int j = i + 1; j < value.length; j++){
                if (value[i] == value[j]){
                    value[j] = 0;
                }
            }
            System.out.print(value[i] + " ");
        }
    }
}

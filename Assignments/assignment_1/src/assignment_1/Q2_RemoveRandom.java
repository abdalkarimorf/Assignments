package assignment_1;
import java.util.*;

public class Q2_RemoveRandom {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Random r = new Random();
        int index = r.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Removed index: " + index);
        System.out.println(Arrays.toString(newArr));
    }
}

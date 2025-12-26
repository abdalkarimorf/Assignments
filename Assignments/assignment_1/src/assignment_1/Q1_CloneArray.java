package assignment_1;

public class Q1_CloneArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] clone = arr.clone();

        for (int i : clone) {
            System.out.print(i + " ");
        }
    }
}

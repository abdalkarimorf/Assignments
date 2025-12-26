package assignment_1;

public class Q3_RemoveSpecific {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int remove = 3;

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != remove) {
                newArr[j++] = arr[i];
            }
        }

        for (int i : newArr)
            System.out.print(i + " ");
    }
}

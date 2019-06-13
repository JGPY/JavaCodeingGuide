package jianzhi_offer_66.id3_2;

public class Solution {

    public static int getDuplication(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1 || arr[i] >= arr.length) {
                return -1;
            }
        }

        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tempArr[arr[i]]) {
                return arr[i];
            }
            tempArr[arr[i]] = arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 1, 5, 4, 3, 2, 6, 7 };
        System.out.println(getDuplication(numbers));
    }
}
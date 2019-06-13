package jianzhi_offer_66.id3_1;
/**
 * @author l
 */
public class Solution {

    public static int duplication;

    public static boolean duplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] >= arr.length) {
                return false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    duplication = arr[i];
                    System.out.println(arr[i]);
                    return true;
                }

                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 1, 4, 2, 5, 7 };
        boolean result = duplicate(arr);
        System.out.println(result);
    }

}
package LeetCode;

public class MissingNumber {
    public static int MissingNumber(int[] arr) {
        int sum = 0;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) ;
            else sum += arr[i];
        }
        return (55 - sum);
    }

    public static void main(String[] args) {
        System.out.println(MissingNumber(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10}));
    }


}

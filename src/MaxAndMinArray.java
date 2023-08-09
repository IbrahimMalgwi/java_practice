import java.util.Arrays;

public class MaxAndMinArray {

    public static int max(int[] arr){
        int maxValue = arr[0];
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }

    public static int min(int[] arr){
        int minValue = arr[0];
        for (int j : arr) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }

    public static int[] sortedDescending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortedAscending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 9, 11, 3, 22};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(Arrays.toString(sortedDescending(arr)));
        System.out.println(Arrays.toString(sortedAscending(arr)));
    }

}

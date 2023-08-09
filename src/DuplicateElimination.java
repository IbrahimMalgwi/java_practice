import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        boolean isEmpty = true;
        boolean isDuplicate = false;
        int count = 0;

        while (isEmpty){
            System.out.println("Enter 10 numbers");
            int num = input.nextInt();

            boolean isValidNum = num >= 10 && num <=100;

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i]==num){
                    isDuplicate = true;
                    break;
                }
                else isDuplicate = false;
            }

            if (isValidNum == true && isDuplicate == false){
                arr[count] = num;
                count++;
            }

            for (int i = 0; i <arr.length ; i++) {
                if (arr[i] == -1) {
                    isEmpty = true;
                    break;
                }
                else isEmpty = false;
            }

            System.out.println(Arrays.toString(arr));

        }

    }
}
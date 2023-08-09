import java.util.Scanner;

public class Practice {

    public static void main (String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score ");

        int score = input.nextInt();


        if (score >= 80 && score <= 100) {
            System.out.println("You got A");
        } else if (score > 70 ) {
            System.out.println("You got B");
        }  else if (score > 70 ) {
            System.out.println("You got C");
        } else if (score > 60 ) {
            System.out.println("You got D");
        } else if (score > 50 ) {
            System.out.println("You got E");
        } else {
            System.out.println("You got F");
        }


    }
}

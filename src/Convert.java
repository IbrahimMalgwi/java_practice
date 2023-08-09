import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        double weightInKilograms = weightInPounds / 0.454;

        System.out.printf("%.1f%s%.3f%s", weightInPounds, " pounds is ", weightInKilograms, " killograms");
    }
}

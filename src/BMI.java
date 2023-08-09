import java.awt.Point;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter Height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilogram = weightInPounds * 0.45359237;
        double heightInMeter = heightInInches * 0.0254;

        double result = weightInKilogram / (heightInMeter * heightInMeter);

        System.out.printf("Your BMI is %.4f", result);


    }
}

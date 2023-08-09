import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        Human jane = new Human(23, "Female", "jane");

        Human kate = new Human(25, "Female", "Kate");

        System.out.println(jane.getAge());
        System.out.println(jane.getName());
        System.out.println(jane.getGender());

        System.out.println("------------------------");

        /* System.out.println(kate.getAge());
        System.out.println(kate.getGender());
        */
        System.out.println(kate.getName());




    }
}

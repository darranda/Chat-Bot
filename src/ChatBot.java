import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {


        greeting();
        name();
        age();

        counting();
        knowledge();
    }

    static Scanner scanner = new Scanner(System.in);


    public static void greeting() {
        System.out.println("Hello!");
        System.out.println("What's your name?");
        String userName = (scanner.nextLine());

    }

    public static void name() {
        System.out.println("I'm sorry, can you repeat your name?");
        String userName = (scanner.nextLine());
        System.out.println("Nice to meet you " + userName + "!");

    }

    public static void age() {
        System.out.println("I'm going to try to guess your age.");

        int age = 0;

        System.out.println("Were you born after 2010? Enter true or false.");
        boolean bornAfter2010 = scanner.nextBoolean();

        System.out.println("Are you currently in your twenties? Enter true or false.");
        boolean inTwenties = scanner.nextBoolean();

        System.out.println("Are you currently in your thirties? Enter true or false.");
        boolean inThirties = scanner.nextBoolean();

        if (bornAfter2010) {
            age = (int) ((Math.random() * 100) + 0);
        } else if (inTwenties) {
            age = (int) ((Math.random() * 29) + 20);
        } else if (inThirties) {
            age = (int) ((Math.random() * 39) + 30);
        } else {
            age = (int) ((Math.random() * 100) + 40);
        }

        System.out.println("I'm going to guess your age now!");
        System.out.println("You are " + age + " years old!");

    }
    public static void counting () {
        System.out.println("I can count too! Pick a number:");
        int num1 = scanner.nextInt();
        for (int i = 0; i <= num1; i++) {
            System.out.println(i);
        }
        System.out.println("We counted to " + num1 + "!");
    }
    public static void knowledge () {
        System.out.println("Lets see how smart you are! Enter 'a', 'b', 'c' or 'd'.");
        System.out.println("What is the correct syntax for declaring an array of integers?");
        System.out.println("A. int[] myArray = new int[]");
        System.out.println("B. int[] myArray = new int[5]");
        System.out.println("C. myArray[] = new int[5]");
        System.out.println("D. myArray = new int[]");
        scanner.nextLine();

        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("B")) {
            System.out.println("Sorry, try again.");
            answer = scanner.nextLine();
        }
        System.out.println("Great Job!");
    }
}

import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args){
        String name, weather;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's not very old.");
        System.out.print("How much do you weigh, " + name + "? ");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.print("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println ( name + ".");

        System.out.print("Oh, hey. I almost forgot! What's the weather like where you are today? ");
        weather = keyboard.next();

        System.out.println(weather + ", hm? Okay. Thanks for the info!");
    }
}
// The program doesn't blow up if I input an integer for a double because doubles include (accept) integers. They convert them to (int).0
// The program doesn't blow up if I input a numeric value when it's expecting a string because strings include (accept) all characters, including numbers.
/* For question one, I couldn't find an entry that would make it blow up. I think this is because it's expecting a string and strings can include any and all characters the keyboard can input. On question two I typed a double (77.2), and that blew it up because ints don't accept doubles(numbers with decimals.)
For question three, I typed some gibberish letters ("asdfasdfas"), which blew up the program because it was expecting a double and doubles can't deal with letters. On question four, I typed "dog," and this blew up the program
because it was expecting a double and I gave it some letters. */

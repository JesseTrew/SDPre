import java.util.Scanner;

public class Objective3Lab1 {
    public static void main(String[] args) {
        String userInput = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Please type a word: ");
        userInput = input.next();

        System.out.println(userInput);

        input.close();
    }
}
// The lab's Starter Code does not include line 1 here. Without it, the program won't run.
// Also, the lab's last included line in the source code (input.close etc.) was not mentioned in the JTHW exercises and can be omitted without affecting the program's output. I've included it here anyway.
// Also, line 5 can be changed to only declare the variable userInput without assigning an empty value, and the program's output is unaffected.

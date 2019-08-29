import java.util.Scanner;

public class EnterPIN{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String entry1;
        int pin, entry;

        entry1 = "cabbage";
        pin = 12345;

        System.out.println("WELCOME TO THE BANK OF JAVA.");
        System.out.print("ENTER YOUR PASSWORD: ");
        entry1 = keyboard.next();

        while (! entry1.equals("cabbage")){
            System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
            System.out.print("ENTER YOUR PASSWORD: ");
            entry1 = keyboard.next();
        }

        System.out.print("PASSWORD ACCEPTED. ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while (entry != pin){
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
    }
}

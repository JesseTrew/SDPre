public class CreatingVariables {
    public static void main(String[] args) {
        int x, y, age, num;
        double seconds, e, checking, era;
        String firstName, lastName, title, job, city;

        x = 10;
        y = 400;
        age = 39;
        num = 3;
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        era = 2.17;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        job = "landscaper";
        city = "Los Angeles";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "The picther's ERA is " + era + ".");
        System.out.println( "My favorite number is " + num + ".");
        System.out.println( "I live in " + city + ".");
        System.out.println( "I am a " + job + ".");
    }
}

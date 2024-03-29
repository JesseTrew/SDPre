import java.util.Scanner;

public class BMICategories{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, in, lb;

        System.out.print("Your height in inches: ");
        in = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: ");
        lb = keyboard.nextDouble();

        m = in / 39.37;
        kg = lb / 2.205;
        bmi = kg / (m*m);

        System.out.print("BMI category: ");
        if (bmi < 15.0){
            System.out.println("very severely underwieght");
        }
        else if (bmi <= 16.0){
            System.out.println("severely underweight");
        }
        else if (bmi < 18.5){
            System.out.println("underweight");
        }
        else if (bmi < 25.0){
            System.out.println("normal weight");
        }
        else if (bmi < 30.0){
            System.out.println("overweight");
        }
        else if (bmi < 35.0){
            System.out.println("moderately overweight");
        }
        else if (bmi < 40.0){
            System.out.println("severely obese");
        }
        else{
            System.out.println("very severely/\"morbidly\" obese");
        }
    }
}

public class Objective2Lab5{
    public static void main(String [] args){
        double side1, side2, side1sq, side2sq, hypotenuse;
        side1 = 5;
        side2 = 7;
        side1sq = side1 * side1;
        side2sq = side2 * side2;
        hypotenuse = Math.sqrt(side1sq + side2sq);
        System.out.println("The hypotenuse of a triangle with sides of " + side1 + " and " + side2 + " is " + hypotenuse + ".");
    }
}

public class Objective6Lab4{
    public static void main(String[] args){
        int sum = 0, count = 1;

        while (count <= 20){
            sum = count + sum;
            count = count+1;
        }
        System.out.println(sum);
    }
}

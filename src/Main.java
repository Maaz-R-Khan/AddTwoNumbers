import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;
        int sum;

        Scanner result = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = result.nextInt();
        num2 = result.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of the two numbers you entered are: " + sum);
    }
}

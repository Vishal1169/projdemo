import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter third number:");
        double num3 = scanner.nextDouble();

        double largest = Math.max(Math.max(num1, num2), num3);
        double sum = largest + largest;

        System.out.println("The sum of the largest number is: " + sum);
    }
}
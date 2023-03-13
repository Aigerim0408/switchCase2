import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Choose operator: + , - , * , / ");
        char operator = scan.next().charAt(0);
        double sum;
        switch (operator) {
            case '+':
                sum = num + num2;
                System.out.println(num + " + " + num2 + " = " + sum);
                break;
            case '-':
                sum = num - num2;
                System.out.println(num + " - " + num2 + " = " + sum);
                break;
            case '*':
                sum = num * num2;
                System.out.println(num + " * " + num2 + " = " + sum);
                break;
            case '/':
                sum = num / num2;
                System.out.println(num + " / " + num2 + " = " + sum);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
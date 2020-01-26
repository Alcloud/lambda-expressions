import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Math math = new Math();
        Operation operation;
        Scanner scanner = new Scanner(System.in);

        int answer;
        String result = null;

        System.out.println("Chose operation:\n1 - odd, 2 - prime, 3 - palindrome");
        int input = scanner.nextInt();

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (input == 1) {
            operation = math.odd();
            answer = Math.executor(operation, number);
            result = (answer == 0) ? "the number is even" : "the number is odd";
        } else if (input == 2) {
            operation = math.prime();
            answer = Math.executor(operation, number);
            result = (answer == 0) ? "the number is prime" : "the number is composite";
        } else if (input == 3) {
            operation = math.palindrome();
            answer = Math.executor(operation, number);
            result = (answer == 0) ? "the number is palindrome" : "the number isn't palindrome";

        }
        System.out.println(result);
    }
}
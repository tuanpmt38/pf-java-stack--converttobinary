import java.util.Scanner;
import java.util.Stack;

public class ConvertToBinary {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer number to convert: ");
        int number = input.nextInt();
        while (number > 0) {
            int surplus = number % 2;
            stack.push(surplus);
            number = number / 2;
        }
        System.out.println("Converted to binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
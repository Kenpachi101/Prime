import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int temp = num;
        int reverseNum = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reverseNum = reverseNum * 10 + remainder;
            temp = temp / 10;
        }

        if (num == reverseNum) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
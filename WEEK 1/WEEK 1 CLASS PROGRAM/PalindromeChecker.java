import java.util.*;

public class PalindromeChecker {

    // 1. Iterative approach
    static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    // 2. Recursive approach
    static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1)
            return true;

        if (text.charAt(0) != text.charAt(text.length() - 1))
            return false;

        return isPalindromeRecursive(
                text.substring(1, text.length() - 1)
        );
    }

    // 3. Array reversal approach
    static boolean isPalindromeArrayReversal(String text) {

        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        String reversed = new String(arr);

        return text.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println(
            "Iterative: " +
            (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome")
        );

        System.out.println(
            "Recursive: " +
            (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome")
        );

        System.out.println(
            "Array Reversal: " +
            (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome")
        );

        sc.close();
    }
}
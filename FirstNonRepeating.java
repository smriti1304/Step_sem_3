import java.util.*;

public class FirstNonRepeating {

    static char findFirstNonRepeatingChar(String text) {

        HashMap<Character, Integer> frequency = new HashMap<>();

        // Count frequency
        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : text.toCharArray()) {
            if (frequency.get(ch) == 1)
                return ch;
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println(
                "First Non-Repeating Character: '" + result + "'"
            );

        sc.close();
    }
}
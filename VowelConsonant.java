import java.util.Scanner;

public class VowelConsonant {

    static void countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == ' ')
                continue;

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                vowels++;
            }
            else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels +
                           " | Consonants: " + consonants);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        countVowelsAndConsonants(text);

        sc.close();
    }
}

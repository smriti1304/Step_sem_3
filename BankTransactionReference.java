import java.util.Scanner;

public class BankTransactionReference {

    static String normalizeReference(String raw) {

        raw = raw.trim();

        if (raw.length() < 3) {
            return raw;
        }

        String bankCode = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);

        return bankCode + remaining;
    }

    static String validateAndFormat(String reference) {

        // Check length
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Check remaining 11 characters are digits
        for (int i = 3; i < reference.length(); i++) {

            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String bankCode = reference.substring(0, 3);

        String date = reference.substring(3, 9);

        String sequence = reference.substring(9);

        // Convert ddMMyy to dd/MM/yy
        String formattedDate =
                date.substring(0, 2) + "/" +
                date.substring(2, 4) + "/" +
                date.substring(4, 6);

        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(bankCode);
        result.append("] DATE: ");
        result.append(formattedDate);
        result.append(" | SEQ: ");
        result.append(sequence);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");

        String raw = sc.nextLine();

        String normalized = normalizeReference(raw);

        String result = validateAndFormat(normalized);

        System.out.println(result);

        sc.close();
    }
}
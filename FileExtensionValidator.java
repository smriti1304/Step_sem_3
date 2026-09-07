import java.util.Scanner;

public class FileExtensionValidator {

    static String validateFileExtension(String filename) {

        int dotPosition = filename.lastIndexOf('.');

        if (dotPosition == -1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dotPosition + 1);

        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        }

        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        System.out.println(validateFileExtension(filename));

        sc.close();
    }
}
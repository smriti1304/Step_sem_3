import java.util.*;

public class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {

        char[] arr = customerName.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {

            char temp = arr[i];

            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        String reversed = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversed);

        sc.close();
    }
}
import java.util.Scanner;
public class PalindromeCheckerApp {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word or phrase: ");
            String input = sc.nextLine();

            // Remove spaces and convert to lowercase for uniform comparison
            String cleaned = input.replaceAll("\\s+", "").toLowerCase();

            // Reverse the string
            String reversed = new StringBuilder(cleaned).reverse().toString();

            // Check if palindrome
            if(cleaned.equals(reversed)) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("Not a palindrome.");
            }

            sc.close();
        }
    }



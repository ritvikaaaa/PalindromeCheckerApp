// File: UseCase2PalindromeCheckerApp.java

public class UseCase2PalindromeCheckerApp {
    // Main method - Entry point of the program
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam"; // String literal stored in the string pool

        // Reverse the string using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i); // Access each character
        }

        // Conditional statement to check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome."); // Console output
        } else {
            System.out.println(word + " is not a palindrome."); // Console output
        }

        // Program ends automatically after main method finishes
    }
}

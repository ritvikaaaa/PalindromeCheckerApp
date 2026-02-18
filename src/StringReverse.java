public class StringReverse {

        public static void main(String[] args) {

            // Hardcoded string to check
            String word = "racecar";

            // Reverse the string using StringBuilder
            String reversed = new StringBuilder(word).reverse().toString();

            // Check if the original word and reversed word are the same
            if (word.equals(reversed)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }

            // Program ends after main method
        }
    }





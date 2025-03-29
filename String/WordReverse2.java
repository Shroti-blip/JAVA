public class WordReverse2 {
    // public class WordReverserWithoutReverse {
    
        static String wordReverser() {
            String input = "hello world";
            String[] words = input.split(" "); // Split the input string into words
            String reversedSentence = ""; // Initialize an empty string for the result
    
            for (int i = 0; i < words.length; i++) {
                String word = words[i]; // Get the current word
                String reversedWord = ""; // Temporary storage for the reversed word
    
                // Reverse the current word manually
                for (int j = word.length() - 1; j >= 0; j--) {
                    reversedWord += word.charAt(j); // Append characters in reverse order
                }
    
                // Add the reversed word to the result
                reversedSentence += reversedWord;
    
                // Add a space after each word except the last one
                if (i < words.length - 1) {
                    reversedSentence += " ";
                }
            }
    
            return reversedSentence; // Return the reversed sentence
        }
    
        public static void main(String[] args) {
            String result = wordReverser();
            System.out.println(result); // Output: "olleh dlrow"
        }
    // }
    
}

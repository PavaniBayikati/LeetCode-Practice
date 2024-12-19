import java.util.Stack;

public class ReverseWordsStack {
    public static String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();
        
        // Step 2: Initialize a stack to store words
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        // Step 3: Traverse the string
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                // If space is encountered, push the word to the stack (if not empty)
                if (word.length() > 0) {
                    stack.push(word.toString());
                    word.setLength(0); // Clear the word
                }
            } else {
                // Build the current word
                word.append(c);
            }
        }

        // Push the last word (if exists)
        if (word.length() > 0) {
            stack.push(word.toString());
        }

        // Step 4: Construct the reversed string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" "); // Add a space between words
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "  hello   world  ";
        System.out.println(reverseWords(s)); // Output: "world hello"
    }
}

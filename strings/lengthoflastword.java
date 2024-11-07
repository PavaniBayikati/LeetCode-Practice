import java.util.*;

class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Step 1: Trim any extra spaces from the string
        s = s.trim();

        // Step 2: Start counting from the end
        int length = 0;

        // Start iterating from the last character
        for (int i = s.length() - 1; i >= 0; i--) {
            // If we encounter a space and we've started counting, break out of the loop
            if (s.charAt(i) == ' ' && length > 0) {
                break;
            }
            // Otherwise, count the characters of the last word
            length++;
        }

        // Step 3: Return the length of the last word
        return length;
    }
}

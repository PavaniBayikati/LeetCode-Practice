class fancystring {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            // Check if we already have two consecutive identical characters at the end of
            // the result
            int length = result.length();
            if (length >= 2 && result.charAt(length - 1) == s.charAt(i) && result.charAt(length - 2) == s.charAt(i)) {
                continue; // Skip this character to avoid three consecutive identical characters
            }
            // Otherwise, add the character to the result
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}

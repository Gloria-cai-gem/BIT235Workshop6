// ReverseWords.java
// Exercise 3: reverse the letters in each word of a sentence, keeping
// punctuation (such as the full stop) in its original place.
// Example: "To be or not to be." -> "oT eb ro ton ot eb."
public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int left = 0;
            int right = chars.length - 1;

            // reverse only letters; skip non-letter characters
            while (left < right) {
                if (!Character.isLetter(chars[left])) {
                    left++;
                } else if (!Character.isLetter(chars[right])) {
                    right--;
                } else {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }

            result.append(new String(chars));
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + result.toString());
    }
}

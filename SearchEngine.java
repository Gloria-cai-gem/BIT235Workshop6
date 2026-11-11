// SearchEngine.java
// Exercise 5: search a phrase through an array of 10 paragraphs using
// String.contains(). If found, output the array index and the paragraph;
// otherwise output a message stating that the phrase was not found.
public class SearchEngine {
    public static void main(String[] args) {
        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        String phrase = "keyword search";
        boolean found = false;

        System.out.println("Searching for: \"" + phrase + "\"");
        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].contains(phrase)) {
                found = true;
                System.out.println("Found at index " + i + ": " + paragraphs[i]);
            }
        }

        if (!found) {
            System.out.println("The phrase \"" + phrase + "\" was not found in any paragraph.");
        }
    }
}

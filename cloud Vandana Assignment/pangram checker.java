import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Create a set to store the unique alphabet letters found in the sentence
        Set<Character> alphabetSet = new HashSet<>();

        // Convert the sentence to lowercase to make it case-insensitive
        sentence = sentence.toLowerCase();

        // Iterate through the characters in the sentence
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        // Check if the set size is equal to 26 (number of letters in the alphabet)
        return alphabetSet.size() == 26;
    }
}

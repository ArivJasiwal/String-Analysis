import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);
        int uppercaseCount = countUppercase(sentence);

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }

    public static int countVowels(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isConsonant(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countUppercase(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z' && !isVowel(ch));
    }
}

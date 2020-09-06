import java.util.Scanner;

public class SortByLetters {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your word to sort...");

        String wordToScan = scanner.next().toUpperCase();
        System.out.println("Your word: " + wordToScan +" will be sorted...");

        char[] wordToScanArrayed = wordToScan.toCharArray();

        for (int i = 0; i < wordToScanArrayed.length; i++) {
            for (int j = 0; j < wordToScanArrayed.length - 1; j++) {
                if (wordToScanArrayed[j] > wordToScanArrayed[j + 1]) {
                    char temp = wordToScanArrayed[j];
                    wordToScanArrayed[j] = wordToScanArrayed[j + 1];
                    wordToScanArrayed[j + 1] = temp;
                }
            }
        }
        System.out.println(wordToScanArrayed);
    }
}

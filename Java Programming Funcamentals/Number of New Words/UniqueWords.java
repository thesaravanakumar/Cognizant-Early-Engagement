import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Article");
        String article = scanner.nextLine();
        String[] allWords = article.split("[,;:.?! ]");
        List<String> words = Arrays.stream(allWords)
                                    .filter(string -> !string.isEmpty())
                                    .collect(Collectors.toList());
        List<String> uniqueWords = words.stream()
                                        .map(String::toLowerCase)
                                        .distinct()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Number of words " + words.size());
        System.out.println("Number of unique words " + uniqueWords.size());
        System.out.println("The words are");
        
        IntStream.range(0, uniqueWords.size())
                .forEach(i -> System.out.println(String.format("%d. %s", (i + 1), uniqueWords.get(i))));

        scanner.close();
    }
}

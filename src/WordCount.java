import java.util.Scanner;
import java.io.File;

public class WordCount {
    // throws Exception in case there is a problem reading file or if it isn't there
    public static void main(String [] args) throws Exception {
        File file = new File("GrimmStories.txt");
        Scanner scanner = new Scanner(file);

        int totalWordCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int wordLength = line.split(" ").length;
            totalWordCount += wordLength;
        }

        System.out.println(totalWordCount);
    }
}

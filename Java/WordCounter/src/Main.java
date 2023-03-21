import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int characterCount = 0;
        int wordCount = 0;

        String s = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Paste the paragraph/text you'd like to count.");

        if(scanner.hasNextLine())
            s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++)
        {
            if (i == 0 && s.charAt(i) != ' ')
                wordCount = 1;

            characterCount++;
            if (s.charAt(i) == ' ')
            {
                wordCount++;
            }
        }

        System.out.println("\n Character Count is - " + characterCount + " / " + "Word Count is - " + wordCount);
    }
}
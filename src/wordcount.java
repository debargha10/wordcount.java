import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter text  to count the words:");


        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Input is empty. Exiting.");
            return;
        }


        String[] words = input.split("[\\s\\p{Punct}]+");


        int wordCount = 0;


        for (String word : words) {

            wordCount++;
        }


        System.out.println("Total word count: " + wordCount);

        
    }
}


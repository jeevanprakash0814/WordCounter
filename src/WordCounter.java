import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {

    public WordCounter()
    {
        System.out.println(totalWords() + " Words.");
    }

    private static int totalWords()
    {
        return wordsInLine(populateTextFile());
    }

    private static String populateTextFile()
    {
        FileWriter inputWriter;
        Scanner inputScanner = new Scanner(System.in);
        String inputStr = "";

        try
        {
            inputStr = inputScanner.nextLine();
            inputWriter = new FileWriter("inputText.txt");
            inputWriter.write(inputStr);
            inputScanner.close();
            inputWriter.close();
        }
        catch (IOException i){
            System.out.println("Error " + i.getMessage());
        }
        return inputStr;
    }

    private static int wordsInLine(String str)
    {
        if(str.equals("")) return 0;
        String[] words = str.trim().split(" ");
        return words.length;
    }

    public static void main(String args[]) {
        WordCounter wc = new WordCounter();
    }

}
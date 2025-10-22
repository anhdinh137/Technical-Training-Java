import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {
    // There are also many ways to read files:
    // Scanner: best for simple text
    // BufferedReader: best for large text file
    // FileInputStream: best for binary data
    public static void main(String[] args) {
        File file = new File("testing.txt");

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Example for bufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("testing.txt"))){
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

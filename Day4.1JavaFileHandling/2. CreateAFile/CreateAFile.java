import java.io.File;
import java.io.IOException;

public class CreateAFile{
    public static void main(String[] args) {
        // Try...Catch is important and needed because createNewFile throw an exception
        try {
            File file = new File("Testing.txt");
            if (file.createNewFile()){
                System.out.println("File created successfully");
            }
            else {
                System.out.println("File already exist");
            }
        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        try {
            // Create file at specific location
            String path = "C:\\Users\\adinh\\Documents\\GitHub\\Technical-Training-Java\\Day4.1JavaFileHandling\\2. CreateAFile\\";
            String filename = "Testing1.txt";
            File file = new File(path + filename);
            if (file.createNewFile()){
                System.out.println("File created successfully");
            }
            else {
                System.out.println("File already exist");
            }
        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
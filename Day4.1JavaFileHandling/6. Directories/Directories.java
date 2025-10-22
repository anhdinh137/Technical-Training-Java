import java.io.File;

public class Directories {
    public static void main(String[] args) {
        String directoryName = "My_Learning";
        
        // current directory
        String currentDirectory = System.getProperty("user.dir");
        String directoryPath = currentDirectory + File.separator + directoryName;
        File directory = new File(directoryPath);

        // create directory
        boolean directoryCreated = directory.mkdir();

        if (directoryCreated) {
            System.out.println("Directory created at: " + directoryPath);
        } else {
            System.out.println("Failed");
        }
    }
}

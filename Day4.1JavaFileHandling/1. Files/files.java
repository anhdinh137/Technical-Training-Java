import java.io.File;
public class files {
    public static void main(String[] args) {
        // The File class from the java.io package, allows us to work with files.
        // this will cover some of the basics of files

        // File(file name / path name)
        File file = new File("TestingFile.txt");

        // get the string for the current directory
        String currentDirectory = System.getProperty("user.dir");
        File directory = new File(currentDirectory);
        // Print the name of the current directory
        System.out.println(currentDirectory);
        // Check if the file exist
        System.out.println(file.exists());
        // Check if the file can be read
        System.out.println(file.canRead());
        // Check if the file can be written
        // Change the file to test only to test 
        System.out.println(file.canWrite());
        // Get the name of the file
        System.out.println(file.getName());
        // Get the absolute path to the file
        System.out.println(file.getAbsolutePath());
        // Get the length of the file in byte
        System.out.println(file.length());

        // return a String array of the file in the directory
        String[] files = directory.list();
        // System.out.println(file.delete());

        for (String f : files){
            System.out.println(f);
        }

        // file.delete() to delete the file
    }
}

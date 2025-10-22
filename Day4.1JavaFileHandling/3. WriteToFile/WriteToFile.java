import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFile {
    public static void main(String[] args) {
        // Using writeString(), when writing small text files or logs occasionally.
        String writeStr = "Using writeString()";
        String path = System.getProperty("user.dir");
        String filename = "writeString.txt";
        File file = new File(path, filename);
        try {
            if (file.createNewFile()){
                System.out.println("Success");
            } else System.out.println("failed");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            Files.writeString(file.toPath(), writeStr);
            System.out.println("success");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Using fileWriter(), for writing small or medium text files, or if you want to append data easily.
        String str = "Using fileWriter()";
        String filename2 = "fileWriter.txt";
        try {
            FileWriter fWriter = new FileWriter(path + "/" + filename2);
            fWriter.write(str);
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Using BufferedWriter, when writing large files or performing repeated writes (like writing a file line by line).
        str = "Using BufferedWriter";
        String filename3 = "BufferedWriter.txt";

        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(path + "/" + filename3));
            bWriter.write(str);
            bWriter.close();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using FileOutputStream, for writing binary data (non-text files).
        str = "Using FileOutputStream()";
        String filename4= "FileOutputStream.txt";
        try {
            FileOutputStream outputStream = new FileOutputStream(filename4);
            byte[] strBytes = str.getBytes();
            outputStream.write(strBytes);
            outputStream.close();
            System.out.println("success");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

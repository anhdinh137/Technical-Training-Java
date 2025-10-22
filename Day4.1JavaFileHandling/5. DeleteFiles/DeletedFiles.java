import java.io.File;

public class DeletedFiles {
    public static void main(String[] args) {

        // Delete file
        // You can delete folder by changing the pathnam in File
        File file = new File("testDelete.txt");

        if (file.delete()){
            System.out.println("Delete successful");
        }
        else {
            System.out.println("Failed");
        }

        
    }
}

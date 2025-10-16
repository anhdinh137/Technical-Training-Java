import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        // Scanner need to know where to take inpu
        // System in for key board input
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        // You can get all primitive input: nextChar, nextLong, ...
        // You can get string input with nextLine()
        System.out.println(num);
        scan.close();
    }
}

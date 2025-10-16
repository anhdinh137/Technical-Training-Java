public class conditionalStatement {
    public static void main(String[] args) {
        // self explanatory also
        int a = 5;
        int b = 4;
        // If statements
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else
            System.out.println("a = b");

        int day = 4;
        switch (day) {
            // After running each case, we need to use break to exit the switch statement
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            // Default case: add a default path that runs if no other condition is met
            default:
                System.out.println("Invalid day");
        }
    }
}

public class ControlStructure {

    public static void main(String[] args) {
        // If-else statement
        int x = 15;
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is not greater than 10");
        }

        // For loop
        System.out.println("Printing numbers from 1 to 10 using a for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // For a new line

        // While loop
        int countdown = 10;
        System.out.println("Countdown from 10 using a while loop:");
        while (countdown > 0) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println(); // For a new line
    }
}
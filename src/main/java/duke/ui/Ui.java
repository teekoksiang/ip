package duke.ui;

import java.util.Scanner;

/**
 * Represents a UI to handle user interaction.
 *
 * @author Tee Kok Siang
 */
public class Ui {
    public static final String GREET_MESSAGE = "Hello! I'm AiBot :)\n\tEnter the command "
            + "you would like to do\n\tEnter 'bye' to exit";
    public static final String EXIT_MESSAGE = "Bye. See you again soon!";

    private final Scanner scanner = new Scanner(System.in);

    /**
     * Prints the message and wraps it with the divider.
     *
     * @param message Message to be printed.
     */
    public void printResponse(String message) {
        assert message != null : "Message should not be null";
        String divider = "\n\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n";
        System.out.println(divider.concat("\t".concat(message.concat("\n"))).concat(divider));
    }

    public void showWelcome() {
        printResponse(GREET_MESSAGE);
    }

    /**
     * Prints the exit message and closes the scanner.
     */
    public void showBye() {
        printResponse(EXIT_MESSAGE);
        scanner.close();
    }

    public void showError(String errorMessage) {
        printResponse("Error: " + errorMessage);
    }

    public String readCommand() {
        return scanner.nextLine();
    }
}

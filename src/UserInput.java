import java.util.Scanner;

public class UserInput {
    private  Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }
}


import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        ListOperations listOperations = new ListOperations();

        System.out.println("Enter 5 lines for the list А:");
        List<String> listA = listOperations.readStrings(userInput, 5);
        listOperations.displayList(listA);

        System.out.println("Enter 5 lines for the list B:");
        List<String> listB = listOperations.readStrings(userInput, 5);
        listOperations.displayList(listB);

        List<String> listC = listOperations.combineLists(listA, listB);
        System.out.println("List C after merging: " + listC);

        listOperations.sortByLength(listC);
        System.out.println("Sorted list C: " + listC);

    }
    }

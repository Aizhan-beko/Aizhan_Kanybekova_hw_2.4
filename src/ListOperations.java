import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public List<String> readStrings(UserInput input, int count) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку: ");
            strings.add(input.getInput());
        }
        return strings;
    }

    public void displayList(List<String> list) {
        System.out.println("Список: " + list);
    }

    public List<String> combineLists(List<String> listA, List<String> listB) {
        List<String> combinedList = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            combinedList.add(listA.get(i));
            combinedList.add(listB.get(listB.size() - 1 - i));
        }
        return combinedList;
    }

    public void sortByLength(List<String> list) {
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}


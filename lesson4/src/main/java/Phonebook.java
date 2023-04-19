import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        List<String> phones = phoneBook.getOrDefault(surname, new ArrayList<>());
        phones.add(phoneNumber);
        phoneBook.put(surname, phones);
    }

    public List<String> get(String surname) {
        return phoneBook.get(surname);
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // задание 1
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "pear", "kiwi", "orange", "banana", "apple", "grape", "peach", "pear", "orange"};
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else wordCount.put(word, 1);
        }

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.print("Количество повторений слов: ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //задание 2
        Phonebook phoneBook = new Phonebook();
        phoneBook.add("Ivanov", "123-45-67");
        phoneBook.add("Petrov", "234-56-78");
        phoneBook.add("Sidorov", "345-67-89");
        phoneBook.add("Ivanov", "456-78-90");
        phoneBook.add("Petrov", "567-89-01");
        System.out.println("Номера телефонов по фамилии Иванов: " + phoneBook.get("Ivanov"));
        System.out.println("Номера телефонов по фамилии Петров: " + phoneBook.get("Petrov"));
        System.out.println("Номера телефоном по фамилии Сидоров: " + phoneBook.get("Sidorov"));
    }
}

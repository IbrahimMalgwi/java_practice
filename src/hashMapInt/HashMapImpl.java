package hashMapInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("judith", "08123456789");
        phonebook.put("joanna", "08132456789");
        phonebook.put("pat", "08143256789");
        phonebook.put("rick", "081675432778");

        Set<String> keys = phonebook.keySet();

        for(String i : keys) {
            System.out.println(i + " : " + phonebook.get(i));
        }
    }
}

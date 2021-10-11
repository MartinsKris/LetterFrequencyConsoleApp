package Methods;

import Models.CharObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Interfaces.DictionaryFormer;

public class FrequencyDictionary implements DictionaryFormer {
    /**
     * As parameter method frequencyDictionary receives character list. Then iterates through english alphabet
     * and counts how many times each letter appears in provided character list. Then creates new object
     * which consist of letter and integer of how many times it appears in character list.
     * @param generatedCharList a list with characters
     * @return Dictionary with char as key and double as value.
     */
    public HashMap<String, Double> frequencyDictionary(List<Character> generatedCharList)
    {
        String[] alphabet =
                { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z" };

        HashMap<String, Double> frequencyDictionary = new HashMap<>();
        List<CharObject> charObjectList = new ArrayList<>();

        for (var charValue : alphabet)
        {
            StringBuilder newCharString = new StringBuilder();

            for (var charVal : generatedCharList){
                newCharString.append(charVal);
            }

            String charString = new String(newCharString);
            double charCount = (charString.length() - charString.replace(charValue, "").length());

            charObjectList.add(new CharObject(charValue, charCount));
        }

        for (var charObjectValue : charObjectList)
        {
            double charCountDouble = (charObjectValue.getIntValue() / generatedCharList.size()) * 100;
            frequencyDictionary.put(charObjectValue.getCharValue(), charCountDouble);
        }

        return frequencyDictionary;
    }
}

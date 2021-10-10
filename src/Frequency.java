import java.io.*;
import java.util.*;

public class Frequency {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\kodak\\IdeaProjects\\Frequency\\sampleTextFrequency.txt");
        Set<Map.Entry<String, Double>> entries = FrequencyDictionary(ReadFile(file)).entrySet();

        for(Map.Entry<String, Double> entry : entries ){
            System.out.println( entry.getKey() + " = " + entry.getValue() + "%");
        }
    }

    /**
     * As parameter method FrequencyDictionary receives character list. Then iterates through english alphabet
     * and counts how many times each letter appears in provided character list. Then creates new object
     * which consist of letter and integer of how many times it appears in character list.
     * @param generatedCharList a list with characters
     * @return Dictionary with char as key and double as value.
     */
    public static Hashtable<String, Double> FrequencyDictionary(List<Character> generatedCharList)
    {
        String[] alphabet =
                { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z" };

        Hashtable<String, Double> frequencyDictionary = new Hashtable<>();
        List<CharObject> charObjectList = new ArrayList<>();

        for (var charValue : alphabet)
        {
            StringBuilder newCharString = new StringBuilder();

            for (var charVal : generatedCharList){
                newCharString.append(charVal);
            }
            String charString = new String(newCharString);
            double charCount = charString.split(charValue).length - 1;

            charObjectList.add(new CharObject(charValue, charCount));
        }

        for (var charObjectValue : charObjectList)
        {
            double charCountDouble = (charObjectValue.getIntValue() / generatedCharList.size()) * 100;
            frequencyDictionary.put(charObjectValue.getCharValue(), charCountDouble);
        }

        return frequencyDictionary;
    }

    /**
     * Read by line from received text. Removes all symbols that isn't letters and empty space.
     * Each line is splitted to character array, then when iterates through array, chars are converted to uppercase
     * and added to final character array where is stored all letters as characters from text file.
     * @param txtFile as text file (.txt) from provided user directory.
     * @return Character array that consists only of letters that was int parameter .txt file, all converted to upper case.
     * @throws IOException an exceptions if an input or output operation is failed or interpreted.
     */
    public static List<Character> ReadFile(File txtFile) throws IOException {
        String line;
        List<Character> charList = new ArrayList<>();
        BufferedReader txtReader = new BufferedReader(new FileReader(txtFile));

        while ((line = txtReader.readLine()) != null){
            line = line.replaceAll("[^a-zA-Z]", "");

            for (char charValue : line.toUpperCase().toCharArray()){
                charList.add(charValue);
            }
        }
        return charList;
    }
}

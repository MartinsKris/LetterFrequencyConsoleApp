import Methods.ContentCharList;
import Methods.FrequencyDictionary;
import java.io.*;
import java.util.*;

public class Frequency {
    public static void main(String[] args) throws IOException {
        FrequencyDictionary dictionaryOfFrequency = new FrequencyDictionary();
        ContentCharList charList = new ContentCharList();
        Set<Map.Entry<String, Double>> entries = dictionaryOfFrequency.frequencyDictionary(charList.readFile()).entrySet();

        for(Map.Entry<String, Double> entry : entries ){
            System.out.println( entry.getKey() + " = " + entry.getValue() + "%");
        }
    }
}

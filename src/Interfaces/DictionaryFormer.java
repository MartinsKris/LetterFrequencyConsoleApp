package Interfaces;

import java.util.HashMap;
import java.util.List;

public interface DictionaryFormer {
    HashMap<String, Double> frequencyDictionary(List<Character> generatedCharList);
}

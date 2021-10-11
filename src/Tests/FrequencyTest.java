package Tests;

import Methods.FrequencyDictionary;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void frequencyDictionary_ListWithTestCharsAndTestDictionary_TrueIfReceivedDictionaryContainsTestDictionaryKeysAndValues()
    {
        //Arrange
        List<Character> testListOfChars = new ArrayList<>(Arrays.asList('A', 'B', 'Z', 'B'));
        FrequencyDictionary dictionaryOfFrequency = new FrequencyDictionary();
        HashMap<String, Double> testDictionary = new HashMap<>();

        testDictionary.put("A", 25.0 ); testDictionary.put("B", 50.0); testDictionary.put("C", 0.0 );
        testDictionary.put( "D", 0.0 ); testDictionary.put( "E", 0.0 ); testDictionary.put( "F", 0.0 );
        testDictionary.put( "G", 0.0 ); testDictionary.put( "H", 0.0 ); testDictionary.put( "I", 0.0 );
        testDictionary.put( "J", 0.0 ); testDictionary.put( "K", 0.0 ); testDictionary.put( "L", 0.0 );
        testDictionary.put( "M", 0.0 ); testDictionary.put( "N", 0.0 ); testDictionary.put( "O", 0.0 );
        testDictionary.put( "P", 0.0 ); testDictionary.put( "Q", 0.0 ); testDictionary.put( "R", 0.0 );
        testDictionary.put( "S", 0.0 ); testDictionary.put( "T", 0.0 ); testDictionary.put( "U", 0.0 );
        testDictionary.put( "V", 0.0 ); testDictionary.put( "W", 0.0 ); testDictionary.put( "X", 0.0 );
        testDictionary.put( "Z", 25.0 );

        //Act
        var dictionaryValue = dictionaryOfFrequency.frequencyDictionary(testListOfChars);

        //Assert
        assertEquals(testDictionary, dictionaryValue);
    }
}
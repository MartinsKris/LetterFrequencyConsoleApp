import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharObjectTest {

    @Test
    public void CharObject_TestCharAndTestIntProvidedToNewObject_ReceivedObjectElementsAreTheSameAsTestValues()
    {
        //Arrange
        String testChar = "Q";
        double testInt = 32;

        //Act
        var objectValue = new CharObject(testChar, testInt);

        //Assert
        assertEquals(testChar, objectValue.getCharValue());
        assertEquals(testInt, objectValue.getIntValue());
    }
}
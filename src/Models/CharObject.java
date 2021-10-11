package Models;

public class CharObject {

    private String _charValue;
    private Double _doubleValue;

    public CharObject(String charValue, Double intValue)
    {
        _charValue = charValue;
        _doubleValue = intValue;
    }
    public String getCharValue(){
        return _charValue;
    }
    public void setCharValue(String newCharValue){
        _charValue = newCharValue;
    }

    public Double getIntValue(){
        return _doubleValue;
    }
    public void setIntValue(Double newIntValue){
        _doubleValue = newIntValue;
    }
}

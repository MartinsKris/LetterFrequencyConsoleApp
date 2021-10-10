public class CharObject {

    private String _charValue;
    private Double _intValue;

    public CharObject(String charValue, Double intValue)
    {
        _charValue = charValue;
        _intValue = intValue;
    }
    public String getCharValue(){
        return _charValue;
    }
    public void setCharValue(String newCharValue){
        _charValue = newCharValue;
    }

    public Double getIntValue(){
        return _intValue;
    }
    public void setIntValue(Double newIntValue){
        _intValue = newIntValue;
    }
}

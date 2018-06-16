

public class SingleValue extends Value {

    public SingleValue(String param, boolean selectionType) {
        this.param = param;
        this.selectionType = selectionType;
    }

    public List<String> getInputPattern() {
        
    }

    public boolean getSelectionType() {
        return selectionType;
    }


}
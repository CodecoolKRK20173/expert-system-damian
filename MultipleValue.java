

public class MultipleValue extends Value {

    public MultipleValue(List<String> params, boolean selectionType) {
        this.params = params;
        this.selectionType = selectionType;
    }

    public List<String> getInputPattern() {
        
    }

    public boolean getSelectionType() {
        return selectionType;
    }


}
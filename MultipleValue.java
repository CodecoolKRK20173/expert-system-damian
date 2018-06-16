import java.util.List;

public class MultipleValue extends Value {

    private boolean selectionType;
    private List<String> params;

    public MultipleValue(List<String> params, boolean selectionType) {
        this.params = params;
        this.selectionType = selectionType;
    }

    public List<String> getInputPattern() {
        return params;
    }

    public boolean getSelectionType() {
        return selectionType;
    }


}
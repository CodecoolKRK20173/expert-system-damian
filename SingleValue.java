import java.util.ArrayList;
import java.util.List;

public class SingleValue extends Value {

    private String param;
    private boolean selectionType;
    private List<String> inputPattern;

    public SingleValue(String param, boolean selectionType) {
        this.param = param;
        this.selectionType = selectionType;
        this.inputPattern = new ArrayList<>();
    }

    public List<String> getInputPattern() {
        return inputPattern;
    }

    public boolean getSelectionType() {
        return selectionType;
    }

    public String getParam() {
        return param;
    }
}
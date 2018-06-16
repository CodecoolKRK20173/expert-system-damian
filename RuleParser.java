import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class RuleParser {

    private RuleRepository ruleRepository;


    public RuleParser() {
        this.ruleRepository = getRuleRepository();
    }


    public RuleRepository getRuleRepository() {
        return new RuleRepository();
    }



}
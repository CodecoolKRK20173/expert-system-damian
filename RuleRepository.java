import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RuleRepository {

    private Map<String, Question> ruleRepository;
    private QuestionIterator questionIterator;


    public RuleRepository() {
        this.ruleRepository = createRuleRepository();
        this.questionIterator = new QuestionIterator();
    }


    public Map<String, Question> createRuleRepository() {
        Map<String, Question> ruleRepository = new HashMap<>();
        return ruleRepository;
    }


    public void addQuestion(Question question) {

    }

    public Iterator<Question> getIterator() {
        
    }


}
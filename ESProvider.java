


public class ESProvider {

    private FactParser factParser;
    private RuleParser ruleParser;


    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers() {

    }

    public boolean getAnswersByQuestion() {
        return true;
    }

    public String evaluate() {
        String evaluate = "";
        return evaluate;
    }




}
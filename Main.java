

public class Main {

    public static void main(String[] args) {

        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser();

        ESProvider provider = new ESProvider(factParser, ruleParser);
    }


}
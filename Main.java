

public class Main {

    private static FactParser factParser;
    private static RuleParser ruleParser;

    public static void main(String[] args) {
        ESProvider provider = new ESProvider(FactParser factParser, RuleParser ruleParser);
    }


}
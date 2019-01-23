package strategy;

public class OfficialGreeting implements Greeting {

    @Override
    public String generateGreeting() {
        return "Such a lovely day to meet you again my lord";
    }
}

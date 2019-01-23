package strategy;

public class EveryDayGreeting implements Greeting {
    @Override
    public String generateGreeting() {
        return "Oh, hello. Nice to see you!";
    }
}

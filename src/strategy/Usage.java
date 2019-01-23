package strategy;

public class Usage {
    public static void main(String[] args){
        GreetinGenarator greetinGenarator=new GreetinGenarator();
        System.out.println(greetinGenarator.generateGreeting(new OfficialGreeting()));

        System.out.println(greetinGenarator.generateGreeting(new SlangGreeting()));

        System.out.println(greetinGenarator.generateGreeting(new EveryDayGreeting()));



    }
}

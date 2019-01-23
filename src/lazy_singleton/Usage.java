package lazy_singleton;

public class Usage {

    public static void main(String[] args){
        God myGod=God.createGod();

        myGod.destryWorld();

        God myBetterGod=God.createGod();

        myBetterGod.makeRain();

    }
}

package thread_safe_singleton;

public class Usage {

    public static void main(String[] args){
        ThreadGod masterGod= ThreadGod.createGod();

        masterGod.makeRain();

        ThreadGod moreThreadsGod = ThreadGod.createGod();

        masterGod.destryWorld();

    }
}

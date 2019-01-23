package thread_safe_singleton;

class ThreadGod {
    private static ThreadGod god;
    void destryWorld(){
        System.out.println("sjandndsoaskjsaamlkasmd");
    }
    void makeRain(){
        System.out.println("Rain Rain Rain");
    }

    private ThreadGod() {
    }

    static ThreadGod createGod(){
         if(god==null){
             synchronized (ThreadGod.class) {
                 System.out.println("Im your new god!");
                 god = new ThreadGod();
                 return god;
             }
         }
         else {
             System.out.println("You gona regret that, nasty human!!!");
             return god;

         }


    }
}

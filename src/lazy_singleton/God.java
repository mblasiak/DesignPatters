package lazy_singleton;

class God {
    private static God god;
    void destryWorld(){
        System.out.println("sjandndsoaskjsaamlkasmd");
    }
    void makeRain(){
        System.out.println("Rain Rain Rain");
    }

    private God() {
    }

    static God createGod(){
         if(god==null){
             System.out.println("Im your new god!");
             god=new God();
             return god;
         }
         else {
             System.out.println("You gona regret that, nasty human!!!");
             return god;

         }


    }
}

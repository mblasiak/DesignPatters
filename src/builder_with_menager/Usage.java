package builder_with_menager;

public class Usage {

    public static void main(String[] args){
        HumanBuilder humanBuilder=new SimpleHumanBuilder("Boby");
        HumanDirector humanDirector=new HumanDirector();
        humanDirector.crateDerp(humanBuilder);
        Human derp=humanBuilder.build();
        System.out.println(derp);

        humanDirector.crateDerp(humanBuilder);
        Human derpWithPassion=humanBuilder.setPassion("Pc games").build();
        System.out.println(derpWithPassion);
    }

}

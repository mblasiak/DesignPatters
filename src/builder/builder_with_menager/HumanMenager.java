package builder.builder_with_menager;

public class HumanMenager {

    public Human createSimpleHuman(String name, int age){
        return new SimpleHumanBuilder(name).setAge(age).Create();
    }
    public Human crateDerp(){
        return new SimpleHumanBuilder("Derp").setAge(21).Create();
    }

}

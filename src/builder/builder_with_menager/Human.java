package builder.builder_with_menager;

public class Human {
    private int age;
    private  String name;
    private String pesel;

    Human(HumanBuilder humanBuilder){
        this.age=humanBuilder.getAge();
        this.name=humanBuilder.getName();
    }
    public String sayHelo(){

        return "Hello im "+ this.name;
    }

}

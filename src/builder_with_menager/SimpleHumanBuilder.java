package builder_with_menager;

public class SimpleHumanBuilder implements HumanBuilder {

    private Human human;
    private String name;

    @Override
    public Human build() {
        Human h=human;
        this.reset();
        return h;
    }

    SimpleHumanBuilder(String name) {
        human=new Human(name);
        this.name=name;
    }

    @Override
    public HumanBuilder setAge(int age) {
        human.setAge(age);
        return this;
    }
    @Override
    public HumanBuilder setPesel(String pesel) {
        human.setPesel(pesel);
        return this;
    }


    @Override
    public HumanBuilder setPassion (String passion) {
        human.setPassion(passion);
        return this;
    }

    @Override
    public void reset() {
        human=null;
        human=new Human(this.name);
    }
}

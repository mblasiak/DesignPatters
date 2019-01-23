package builder.builder_with_menager;

public class SimpleHumanBuilder implements HumanBuilder {
    private String name;
    private int age;

    SimpleHumanBuilder(String name) {
        this.name = name;
    }

    @Override
    public Human Create() {
        return new Human(this);

    }

    @Override
    public HumanBuilder setAge(int age) {
        this.age=age;
        return this;

    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

package builder.builder_with_menager;

public interface HumanBuilder {

    Human Create();
    HumanBuilder setAge(int age);
    int getAge();
    String getName();

}

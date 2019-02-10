package builder.builder_with_menager;

public interface HumanBuilder {

    Human build();
    HumanBuilder setAge(int age);
    HumanBuilder setPesel(String pesel);
    HumanBuilder setPassion(String passion);
    void reset();

}

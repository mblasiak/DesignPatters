package builder.builder_with_menager;

public class Human {
    private int age;
    private  String name;
    private String pesel;
    private String passion="";


    Human(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }


    void setPesel(String pesel) {
        this.pesel = pesel;
    }

    void setPassion(String passion) {
        this.passion = passion;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", passion='" + passion + '\'' +
                '}';
    }
}

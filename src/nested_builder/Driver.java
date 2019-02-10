package nested_builder;

public class Driver {
    private String name;
    private int id;

    Driver(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

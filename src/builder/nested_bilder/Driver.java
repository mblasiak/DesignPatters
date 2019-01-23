package builder.nested_bilder;

public class Driver {
    private String name;
    private int id;

    public Driver(String name, int id) {
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

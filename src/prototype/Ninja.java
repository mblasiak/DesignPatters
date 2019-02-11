package prototype;

public class Ninja implements Prototype {
    private int skillLevel;
    private String name;

    Ninja(String name) {
        this.name = name;

    }

    Ninja(Ninja ninja) {
        this.name=ninja.name;
        this.skillLevel=ninja.skillLevel;
    }

    void increaseSkillLevel(int sklllInPlus){
        skillLevel+=sklllInPlus;

    }

    @Override
    public String toString() {
        return "Ninja{" +
                "skillLevel=" + skillLevel +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Ninja clone() {
        return new Ninja(this);
    }
}

package prototype;

public class SuperNinja extends Ninja {
    private String weapon;

    SuperNinja(String name,String weapon) {
        super(name);
        this.weapon=weapon;
    }

    SuperNinja(SuperNinja superNinja){
        super(superNinja);
        this.weapon=superNinja.weapon;

    }

    @Override
    public SuperNinja clone() {
        return new SuperNinja(this);
    }
}

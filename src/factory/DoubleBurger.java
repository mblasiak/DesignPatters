package factory;

public class DoubleBurger implements Burger {
    private int temp=60;

    @Override
    public void heatUp() {
        temp=60;
    }

    @Override
    public String getAllComponents() {
        return "No addititonal comps";
    }

    @Override
    public void packInBox() {

    }

    @Override
    public int getTem() {
        return temp;
    }
}

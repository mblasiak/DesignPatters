package factory;

public class CheeseBurger implements Burger{
    private int temperatur;
    private int numberOfCheeseSlices;

    CheeseBurger(int temperatur, int numberOfCheeseSlices) {
        this.temperatur = temperatur;
        this.numberOfCheeseSlices = numberOfCheeseSlices;
    }

    @Override
    public void heatUp() {
        temperatur+=40;
    }


    @Override
    public int getTem() {
        return temperatur;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "temperatur=" + temperatur +
                ", numberOfCheeseSlices=" + numberOfCheeseSlices +
                '}';
    }

    @Override
    public String getAllComponents() {
        return toString();
    }

    @Override
    public void packInBox() {
        System.out.println("Burge is in Nice Yellow Box");
    }
}

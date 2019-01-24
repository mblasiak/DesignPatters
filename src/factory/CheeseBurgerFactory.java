package factory;

public class CheeseBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBurger() {
        return new CheeseBurger(30,2);
    }
}

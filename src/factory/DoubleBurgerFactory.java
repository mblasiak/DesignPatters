package factory;

public class DoubleBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBurger() {
        return new DoubleBurger();
    }
}

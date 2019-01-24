package factory;

public class Usage {


    public static void main(String[] args){
        BurgerFactory burgerFactory=new CheeseBurgerFactory();
        Burger burger=burgerFactory.createBurger();
        System.out.println(burger.getAllComponents());
        System.out.println(burger.getTem());

        burgerFactory=new DoubleBurgerFactory();
        burger=burgerFactory.createBurger();
        System.out.println(burger.getAllComponents());
        System.out.println(burger.getTem());



    }
}

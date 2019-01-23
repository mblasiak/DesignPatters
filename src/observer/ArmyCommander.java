package observer;

import java.util.LinkedList;

public class ArmyCommander implements Subject {
    private String name;
    private String rank="private";
    private String lastOrders;
    private LinkedList<Observer> observers= new LinkedList<>();

    public ArmyCommander(String name) {
        this.name = name;
    }

    ArmyCommander(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notyfieObservers() {

        for( Observer ob:observers){
          ob.update();
        }
    }

    void sendOrders(String orders){
        lastOrders=orders;
        notyfieObservers();
    }

    String getLastOrders() {
        return lastOrders;
    }

}

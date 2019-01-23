package observer;

public abstract class TeamLeader implements Observer, Saluting{
    private ArmyCommander armyCommander;
    private String name;
    private String rank="First Rank Team Leader";
    protected String lastOrder;

    TeamLeader(ArmyCommander armyCommander, String name, String rank) {
        this.armyCommander = armyCommander;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public void update() {
        System.out.println("Sir yes sir we gona "+armyCommander.getLastOrders());
    }



}

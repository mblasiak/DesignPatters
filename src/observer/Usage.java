package observer;

public class Usage {


    public static void main(String[] args){
        ArmyCommander armyCommander=new ArmyCommander("John Marsthon","Senior Regiment Capral");

        TeamLeader angryTeamLeader=new TeamLeader(armyCommander,"Filip ONeil","Senior Navy Squal Leader") {
            @Override
            public void salute() {
                System.out.println("Im fucking rid of this Nonsens");
            }
        };

        armyCommander.addObserver(angryTeamLeader);


        armyCommander.sendOrders("Move to Marhvill in two days");
        angryTeamLeader.salute();




    }
}

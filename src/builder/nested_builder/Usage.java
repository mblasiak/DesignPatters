package builder.nested_builder;

public class Usage {


    public static void main(String[] args){
        Driver driver=new Driver("Bob",21);
        RaceCar raceCar=new RaceCar.Builder("SuperFast",driver).setMaxSpeed(230).build();
        System.out.println(raceCar);
    }
}

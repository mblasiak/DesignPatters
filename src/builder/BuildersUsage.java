package builder;

import builder.builder_with_menager.Human;
import builder.builder_with_menager.HumanMenager;
import builder.nested_bilder.Driver;
import builder.nested_bilder.RaceCar;

public class BuildersUsage {

public static void main(String[] args){
    HumanMenager humanMenager=new HumanMenager();

    Human myBestHuman=humanMenager.createSimpleHuman("BOB",12);
    System.out.println(myBestHuman.sayHelo());
    Human derp=humanMenager.crateDerp();
    System.out.println(derp.sayHelo());


    Driver bobyDriver=new Driver("Boby",123);

    RaceCar bobyCar=new RaceCar.Builder("SuperFastBobMoblie",bobyDriver).setMaxSpeed(123).Create();

    System.out.println(bobyCar);


}

}

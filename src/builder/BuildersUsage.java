package builder;

import builder.builder_with_menager.Human;
import builder.builder_with_menager.HumanMenager;

public class BuildersUsage {

public static void main(String[] args){
    HumanMenager humanMenager=new HumanMenager();

    Human myBestHuman=humanMenager.createSimpleHuman("BOB",12);
    System.out.println(myBestHuman.sayHelo());
    Human derp=humanMenager.crateDerp();
    System.out.println(derp.sayHelo());



}

}

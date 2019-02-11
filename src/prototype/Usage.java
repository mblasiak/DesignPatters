package prototype;

public class Usage {


    public static void main(String [] args){
        Ninja bobNinja=new Ninja("Bob");
        System.out.println(bobNinja);
        bobNinja.increaseSkillLevel(23);

        Ninja bobClone=bobNinja.clone();
        System.out.println(bobClone);


        SuperNinja superBob=new SuperNinja("SuperBB","KatanaSWORD");
        superBob.increaseSkillLevel(999);
        SuperNinja supeClone=superBob.clone();
        System.out.println(supeClone);

    }
}

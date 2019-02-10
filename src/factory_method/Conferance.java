package factory_method;

public abstract class Conferance {

    private Speach speachGiver;
    public abstract Speach preperSpeachGiver();
    void giveSpeach(){
        speachGiver=this.preperSpeachGiver();
        System.out.println(speachGiver.giveSpeach());
        System.out.println("Thank you every one for participation!!!");

    }

}

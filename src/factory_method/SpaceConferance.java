package factory_method;

public class SpaceConferance extends Conferance{

    @Override
    public Speach preperSpeachGiver() {
        return new ElonMusk();
    }
}

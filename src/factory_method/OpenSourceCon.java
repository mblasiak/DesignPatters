package factory_method;

public class OpenSourceCon extends Conferance {
    @Override
    public Speach preperSpeachGiver() {
        return new BillGates();
    }
}

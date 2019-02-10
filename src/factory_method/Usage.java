package factory_method;

public class Usage {

    public static void main(String[] args){
        Conferance spaceCon=new SpaceConferance();
        spaceCon.giveSpeach();

        Conferance openConf=new OpenSourceCon();
        openConf.giveSpeach();
    }

}

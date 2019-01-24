package state;

public class Usage {

    public static void main(String[] args){

        GameMenu gameMenu=new GameMenu();
        gameMenu.show(new MainMenu(gameMenu));


    }
}

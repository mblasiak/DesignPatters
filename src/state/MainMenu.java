package state;

import java.util.Scanner;

public class MainMenu extends Menu {

    MainMenu(GameMenu menu) {
        super(menu);
        displayMenu();
        getChosenState();
    }



    @Override
    public void displayMenu() {
        System.out.println("Chose 1 to start game");
        System.out.println("Chose 2 to disp options");
        System.out.println("Chose 3 to show credits");
        System.out.println("Chose 4 to exit");
    }

    private void startGame(){
        System.out.println("Game staring...");
    }



    @Override
    public void getChosenState() {
        Scanner user_input = new Scanner( System.in );
        String option;
        option = user_input.next();

        if(option.equals("1")){
            this.startGame();

        }
        if(option.equals("2")){
            gameMenu.setMenu(new Options(gameMenu));

        }
        if(option.equals("3")){
            gameMenu.setMenu(new Credits(gameMenu));

        }
        if(option.equals("4")){
            System.out.println("Beye");

        }

    }


}

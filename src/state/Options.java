package state;

import java.util.Scanner;

class Options extends Menu{
    Options(GameMenu menu) {
        super(menu);
        displayMenu();
        getChosenState();
    }

    @Override
    void displayMenu() {
        System.out.println("Move=wsad");

        System.out.println("jump=space");

        System.out.println();

        System.out.println("Any key to go back");
    }

    @Override
    void getChosenState() {

        Scanner user_input = new Scanner( System.in );
        String option;
        user_input.next();
        gameMenu.setMenu(new MainMenu(gameMenu));

    }
}

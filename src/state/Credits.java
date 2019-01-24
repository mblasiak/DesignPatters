package state;

import java.util.Scanner;

class Credits extends Menu {

    Credits(GameMenu menu) {
        super(menu);
        displayMenu();
        getChosenState();
    }

    @Override
    void displayMenu() {
        System.out.println("Boby Bob Hyy");
        System.out.println(" William Fred Cox");
        System.out.println(" Freddy Uranium");
        System.out.println(" Carack Nobama");

        System.out.println();

        System.out.println("Any key to go back");
    }

    @Override
    void getChosenState() {
        Scanner user_input = new Scanner( System.in );
        user_input.next();
        gameMenu.setMenu(new MainMenu(gameMenu));


    }
}

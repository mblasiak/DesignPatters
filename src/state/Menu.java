package state;

abstract class Menu {
    GameMenu gameMenu;
    Menu(GameMenu menu){
        this.gameMenu=menu;
    }

    abstract void displayMenu();
    abstract void getChosenState();


}

package state;

class GameMenu {
    private Menu menu;

    void setMenu(Menu menu) {
        this.menu = menu;
    }

    GameMenu(){
    }

    void show(Menu startState){
        menu=startState;

    }


    GameMenu(Menu startState){
        menu=startState;
        menu.displayMenu();
        menu.getChosenState();
    }



}

package masterMind;

import masterMind.controllers.StartController;
import masterMind.views.StartView;

public class MasterMind {
    private StartController startController;

    private StartView starView;
   
    public void jugar() {
        startController = new StartController();
        starView.interactuar(startController);
    }

    public static void main(String[] args) {
        new MasterMind().jugar();

    }

}

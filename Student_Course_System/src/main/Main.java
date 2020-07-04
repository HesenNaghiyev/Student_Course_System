package main;

import config.Config;
import menu.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
        Config.readFromFile();
        Menu.welcomePage();
    }

}

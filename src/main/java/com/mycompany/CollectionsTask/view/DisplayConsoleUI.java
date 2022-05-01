package com.mycompany.CollectionsTask.view;

import java.util.ResourceBundle;

public class DisplayConsoleUI {
    static ResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle();
    
    
    public static void printBaseMenu() {
        String menu = 
                resourceBundle.getString("menu.help") + "\n" +
                resourceBundle.getString("menu.pack") + "\n" +
                resourceBundle.getString("menu.sort") + "\n" +
                resourceBundle.getString("menu.find") + "\n" +
                resourceBundle.getString("menu.language") + "\n" +
                resourceBundle.getString("menu.exit");
        System.out.println(menu);
    }

    public static void printGreetings() {
        System.out.println(resourceBundle.getString("menu.greetings"));
    }

    public static void printIncorrectInput() {
        System.out.println(resourceBundle.getString("exception.incorrectInput"));
    }
    
    public static void printCreatedGiftAndCalculatedWeight(int weight) {
        System.out.println(resourceBundle.getString("menu.packgift") + weight +
                resourceBundle.getString("menu.packgift.metric"));
    }

    public static void printSortMenu() {
        System.out.println("sort menu()...........");
    }
    
}

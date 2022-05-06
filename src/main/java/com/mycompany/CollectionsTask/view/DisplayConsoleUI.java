package com.mycompany.CollectionsTask.view;

import com.mycompany.CollectionsTask.model.Sweetness;
import java.util.ArrayList;

public class DisplayConsoleUI {
    static ResourceBundleManager resourceManager = new ResourceBundleManager();
    
    public static ResourceBundleManager getResourceManager() {
        return resourceManager;
    }
    
    public static void printBaseMenu() {
        System.out.println(
                resourceManager.resourceBundle.getString("menu.show") + "\n" +
                resourceManager.resourceBundle.getString("menu.countweight") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort") + "\n" +
                resourceManager.resourceBundle.getString("menu.find") + "\n" +
                resourceManager.resourceBundle.getString("menu.language") + "\n" +
                resourceManager.resourceBundle.getString("menu.exit"));
    }

    public static void printGreetings() {
        System.out.println(resourceManager.resourceBundle.getString("menu.greetings"));
    }

    public static void printIncorrectInput() {
        System.out.println(resourceManager.resourceBundle.getString("exception.incorrectInput"));
    }
    public static void printIncorrectInputSugarContent() {
        System.out.println(resourceManager.resourceBundle.getString("exception.incorrectSugarContent"));
    }
    
    public static void printIncorrectInputSugarLimits() {
        System.out.println(resourceManager.resourceBundle.getString("exception.incorrectSugarLimit"));
    }
    
    public static void printCreatedGiftAndCalculatedWeight(int weight) {
        System.out.println(resourceManager.resourceBundle.getString("menu.packgift") + weight +
                resourceManager.resourceBundle.getString("menu.packgift.metric"));
    }

    public static void printSortMenu() {
        System.out.println(
                resourceManager.resourceBundle.getString("menu.sort.main") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort.id") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort.title") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort.weight") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort.sugarContent") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort.price") + "\n" +
                resourceManager.resourceBundle.getString("menu.sort.return"));
    }
    
    public static void printArrayListSweetness(ArrayList<Sweetness> arrayListSweetness) {
        if(arrayListSweetness.size() > 0) {
            for(Sweetness s: arrayListSweetness) {
            System.out.println(s);
            }
        } else {
            System.out.println(resourceManager.resourceBundle.getString("exception.emptyList"));
        }
    }

    public static void closeProgram() {
        System.out.println(resourceManager.resourceBundle.getString("close.program"));
    }

    public static void printShowText() {
        System.out.println(resourceManager.resourceBundle.getString("menu.show.text"));
    }

    public static void printFindSweetnessBySugarContentMenu() {
        System.out.println(resourceManager.resourceBundle.getString("menu.find.main"));
    }
    public static void printFindSweetnessMin() {
        System.out.println(resourceManager.resourceBundle.getString("menu.find.firstInput"));
    }
    public static void printFindSweetnessMax() {
        System.out.println(resourceManager.resourceBundle.getString("menu.find.secondInput"));
    }

    public static void changeLanguageMenu() {
        System.out.println(
                resourceManager.resourceBundle.getString("menu.language.main") + "\n" +
                resourceManager.resourceBundle.getString("menu.language.main.en") + "\n" +
                resourceManager.resourceBundle.getString("menu.language.main.ru") + "\n" +
                resourceManager.resourceBundle.getString("menu.language.main.return"));
    }
}
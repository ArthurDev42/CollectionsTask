package com.mycompany.CollectionsTask.view;

import com.mycompany.CollectionsTask.model.Sweetness;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DisplayConsoleUI {
    static ResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle();
    
    
    public static void printBaseMenu() {
        System.out.println(
                resourceBundle.getString("menu.show") + "\n" +
                resourceBundle.getString("menu.countweight") + "\n" +
                resourceBundle.getString("menu.sort") + "\n" +
                resourceBundle.getString("menu.find") + "\n" +
                resourceBundle.getString("menu.language") + "\n" +
                resourceBundle.getString("menu.exit"));
    }

    public static void printGreetings() {
        System.out.println(resourceBundle.getString("menu.greetings"));
    }

    public static void printIncorrectInput() {
        System.out.println(resourceBundle.getString("exception.incorrectInput"));
    }
    public static void printIncorrectInputSugarContent() {
        System.out.println(resourceBundle.getString("exception.incorrectSugarContent"));
    }
    
    public static void printIncorrectInputSugarLimits() {
        System.out.println(resourceBundle.getString("exception.incorrectSugarLimit"));
    }
    
    public static void printCreatedGiftAndCalculatedWeight(int weight) {
        System.out.println(resourceBundle.getString("menu.packgift") + weight +
                resourceBundle.getString("menu.packgift.metric"));
    }

    public static void printSortMenu() {
        System.out.println(
                resourceBundle.getString("menu.sort.main") + "\n" +
                resourceBundle.getString("menu.sort.id") + "\n" +
                resourceBundle.getString("menu.sort.title") + "\n" +
                resourceBundle.getString("menu.sort.weight") + "\n" +
                resourceBundle.getString("menu.sort.sugarContent") + "\n" +
                resourceBundle.getString("menu.sort.price") + "\n" +
                resourceBundle.getString("menu.sort.return"));
    }
    
    public static void printArrayListSweetness(ArrayList<Sweetness> arrayListSweetness) {
        if(arrayListSweetness.size() > 0) {
            for(Sweetness s: arrayListSweetness) {
            System.out.println(s);
            }
        } else {
            System.out.println(resourceBundle.getString("exception.emptyList"));
        }
    }

    public static void closeProgram() {
        System.out.println(resourceBundle.getString("close.program"));
    }

    public static void printShowText() {
        System.out.println(resourceBundle.getString("menu.show.text"));
    }

    public static void printFindSweetnessBySugarContentMenu() {
        System.out.println(resourceBundle.getString("menu.find.main"));
    }
    public static void printFindSweetnessMin() {
        System.out.println(resourceBundle.getString("menu.find.firstInput"));
    }
    public static void printFindSweetnessMax() {
        System.out.println(resourceBundle.getString("menu.find.secondInput"));
    }


    
    
}

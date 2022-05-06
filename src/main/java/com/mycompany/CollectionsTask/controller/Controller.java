package com.mycompany.CollectionsTask.controller;

import com.mycompany.CollectionsTask.model.Factory;
import com.mycompany.CollectionsTask.model.Sweetness;
import com.mycompany.CollectionsTask.view.DisplayConsoleUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller { 
    static ArrayList<Sweetness> arrayListSweetness = Factory.readSweetnessArrayListFromFile();
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int inputCommandNumber = 0;
        DisplayConsoleUI.printGreetings();
        // main menu
        do {
            DisplayConsoleUI.printBaseMenu();
            try {
                inputCommandNumber = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                DisplayConsoleUI.printIncorrectInput();
            }
            // show
            if(inputCommandNumber == 1) {
                DisplayConsoleUI.printShowText();
                DisplayConsoleUI.printArrayListSweetness(arrayListSweetness);
            // count weight gift    
            } else if (inputCommandNumber == 2) {
                DisplayConsoleUI.printCreatedGiftAndCalculatedWeight(countWeightAllSweets());
            // sort menu    
            } else if (inputCommandNumber == 3) {
                sortBy(scanner, inputCommandNumber);
                DisplayConsoleUI.printArrayListSweetness(arrayListSweetness);
            // find by sugar content menu    
            } else if (inputCommandNumber == 4) {
                findSweetnessBySugarContent(scanner);
                
            // change language    
            } else if (inputCommandNumber == 5) {
                changeLanguage(scanner, inputCommandNumber);
                System.out.println("language");
            // exit    
            } else if (inputCommandNumber == 6) {
                DisplayConsoleUI.closeProgram();
                break;
            } else {
                DisplayConsoleUI.printIncorrectInput();
            }
        } while (true);
    }
    
    public static int countWeightAllSweets() {
        int weightAllSweets = 0;
        for(Sweetness sweet: arrayListSweetness) {
            weightAllSweets += sweet.getWeight();
        }
        return weightAllSweets;
    }
    // sort menu
    private static void sortBy(Scanner scanner, int inputCommandNumber) {
        DisplayConsoleUI.printSortMenu();
        try {
                inputCommandNumber = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                DisplayConsoleUI.printIncorrectInput();
            }
        if(inputCommandNumber == 1) {
            quickSortSweetness(0, arrayListSweetness.size()-1, "id");
        } else if (inputCommandNumber == 2) {
            quickSortSweetness(0, arrayListSweetness.size()-1, "title");
        } else if (inputCommandNumber == 3) {
            quickSortSweetness(0, arrayListSweetness.size()-1, "weight");
        } else if (inputCommandNumber == 4) {
            quickSortSweetness(0, arrayListSweetness.size()-1, "sugar");
        } else if (inputCommandNumber == 5) {
            quickSortSweetness(0, arrayListSweetness.size()-1, "price");
        } else if (inputCommandNumber == 6) {
            return;
        } else {
            DisplayConsoleUI.printIncorrectInput();
        }
    }
    
    private static void quickSortSweetness(int start, int end, String fieldName) {  
        if (start < end) {
            int partitionIndex = sortPartition(start, end, fieldName);
            quickSortSweetness(start, partitionIndex - 1, fieldName);  
            quickSortSweetness(partitionIndex + 1, end, fieldName);  
        }  
    }
    
    // used "switch-case" for avoid duplicate this section of code
    private static int sortPartition (int start, int end, String fieldName) {  
        Sweetness pivot = arrayListSweetness.get(end);
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            switch(fieldName) {
                case "id":
                    if (arrayListSweetness.get(j).getId() < pivot.getId()) {  
                        i++;
                        Sweetness temp = arrayListSweetness.get(i);  
                        arrayListSweetness.set(i, arrayListSweetness.get(j));  
                        arrayListSweetness.set(j, temp);
                    }  
                    break;
                case "title":
                    if (arrayListSweetness.get(j).getTitle().compareToIgnoreCase(pivot.getTitle()) < 0) {  
                        i++;
                        Sweetness temp = arrayListSweetness.get(i);  
                        arrayListSweetness.set(i, arrayListSweetness.get(j));  
                        arrayListSweetness.set(j, temp);
                    }
                    break;
                case "weight":
                    if (arrayListSweetness.get(j).getWeight() < pivot.getWeight()) {  
                        i++;
                        Sweetness temp = arrayListSweetness.get(i);  
                        arrayListSweetness.set(i, arrayListSweetness.get(j));  
                        arrayListSweetness.set(j, temp);
                    }
                    break;
                case "sugar":
                    if (arrayListSweetness.get(j).getSugarContent() < pivot.getSugarContent()) {  
                        i++;
                        Sweetness temp = arrayListSweetness.get(i);  
                        arrayListSweetness.set(i, arrayListSweetness.get(j));  
                        arrayListSweetness.set(j, temp);
                    }
                    break;
                case "price":
                    if (arrayListSweetness.get(j).getPrice() < pivot.getPrice()) {  
                        i++;
                        Sweetness temp = arrayListSweetness.get(i);  
                        arrayListSweetness.set(i, arrayListSweetness.get(j));  
                        arrayListSweetness.set(j, temp);
                    }
                    break;    
            }
        }
        Sweetness t = arrayListSweetness.get(i+1);
        arrayListSweetness.set(i+1, arrayListSweetness.get(end));
        arrayListSweetness.set(end, t);
        return (i + 1);  
    }

    private static void findSweetnessBySugarContent(Scanner scanner) {
        DisplayConsoleUI.printFindSweetnessBySugarContentMenu();
        int min = 0;
        int max = 0;
        try {
            DisplayConsoleUI.printFindSweetnessMin();
            min = Integer.parseInt(scanner.next());
            DisplayConsoleUI.printFindSweetnessMax();
            max = Integer.parseInt(scanner.next());
            if(min >= 0 && max >= 0 && min <= max) {
                DisplayConsoleUI.printArrayListSweetness(findSweets(min, max));
                
            } else if(min >= 0 && max >= 0 && min > max) {
                DisplayConsoleUI.printIncorrectInputSugarLimits();
                
            } else {
                DisplayConsoleUI.printIncorrectInputSugarContent();
            }
        } catch (NumberFormatException e) {
            DisplayConsoleUI.printIncorrectInput();
        }
    }
    // find sweets containing a certain amount of sugar
    private static ArrayList<Sweetness> findSweets(int min, int max) {
        ArrayList<Sweetness> sweets = new ArrayList<Sweetness>();
        for(Sweetness s: arrayListSweetness) {
            if(s.getSugarContent() >= min && s.getSugarContent() <= max) {
                sweets.add(s);
            }
        }
        return sweets;
    }

    private static void changeLanguage(Scanner scanner, int inputCommandNumber) {
        DisplayConsoleUI.changeLanguageMenu();
        try {
            inputCommandNumber = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            DisplayConsoleUI.printIncorrectInput();
        }
        if(inputCommandNumber == 1) {
            DisplayConsoleUI.getResourceManager().setLanguageEn();
        } else if(inputCommandNumber == 2) {
            DisplayConsoleUI.getResourceManager().setLanguageRu();
        } else if(inputCommandNumber == 3) {
            
        } else {
            DisplayConsoleUI.printIncorrectInput();
        }
    }
}
package com.mycompany.CollectionsTask.controller;

import com.mycompany.CollectionsTask.model.Factory;
import com.mycompany.CollectionsTask.model.Sweetness;
import com.mycompany.CollectionsTask.view.DisplayConsoleUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller { 
    static ArrayList<Sweetness> arrayListSweetness;
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int inputCommandNumber = 0;
        DisplayConsoleUI.printGreetings();
        do {
            DisplayConsoleUI.printBaseMenu();
            try {
                inputCommandNumber = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                DisplayConsoleUI.printIncorrectInput();
            }
            if(inputCommandNumber == 1) {
                System.out.println("Unknown command, use \"help\" to get a list of available commands.");
            } else if (inputCommandNumber == 2) {
                arrayListSweetness = Factory.readSweetnessArrayListFromFile();
                System.out.println("Собрать детский подарок с определением его веса. ");
            } else if (inputCommandNumber == 3) {
                System.out.println("ffff");
                sortBy(scanner, inputCommandNumber, arrayListSweetness);
                System.out.println("Провести сортировку конфет в подарке на основе одного из параметров. fffff");
            } else if (inputCommandNumber == 4) {
                System.out.println("Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.");
            } else if (inputCommandNumber == 5) {
                for(Sweetness s: arrayListSweetness) {
                    System.out.println(s);
                }
                System.out.println("language");
            } else if (inputCommandNumber == 6) {
                System.out.println("EXIT");
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

    private static void sortBy(Scanner scanner, int inputCommandNumber, ArrayList<Sweetness> arrayListSweetness) {
        DisplayConsoleUI.printSortMenu();
        System.out.println("enter 1");
        try {
                inputCommandNumber = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                DisplayConsoleUI.printIncorrectInput();
            }
        if(inputCommandNumber == 1) {
            quickSortById(arrayListSweetness, 0, arrayListSweetness.size()-1);
        } else if (inputCommandNumber == 2) {
            sortByTitle(arrayListSweetness);
        } else if (inputCommandNumber == 3) {
            sortByWeight(arrayListSweetness);
        } else if (inputCommandNumber == 4) {
            sortBySugarContent(arrayListSweetness);
        } else if (inputCommandNumber == 5) {
            sortByPrice(arrayListSweetness);
        } else if (inputCommandNumber == 6) {
            return;
        } else {
            DisplayConsoleUI.printIncorrectInput();
        }
    }
    
    private static int partition (ArrayList<Sweetness> arrayList, int start, int end) {  
        Sweetness pivot = arrayList.get(end);
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arrayList.get(j).getId() < pivot.getId()) {  
                i++;
                Sweetness temp = arrayList.get(i);  
                arrayList.set(i, arrayList.get(j));  
                arrayList.set(j, temp);
            }  
        }
        Sweetness t = arrayList.get(i+1);
        arrayList.set(i+1, arrayList.get(end));
        arrayList.set(end, t);
        return (i + 1);  
    }
    
    private static void quickSortById(ArrayList<Sweetness> arrayList, int start, int end) {  
        if (start < end) {  
        int p = partition(arrayList, start, end);  //p is partitioning index  
        quickSortById(arrayList, start, p - 1);  
        quickSortById(arrayList, p + 1, end);  
        }  
    }
    
    private static void sortByTitle(ArrayList<Sweetness> arrayListSweetness) {
        if(arrayListSweetness.size() <= 1) return;
    }

    private static void sortByWeight(ArrayList<Sweetness> arrayListSweetness) {
        if(arrayListSweetness.size() <= 1) return;
    }

    private static void sortBySugarContent(ArrayList<Sweetness> arrayListSweetness) {
        if(arrayListSweetness.size() <= 1) return;
    }

    private static void sortByPrice(ArrayList<Sweetness> arrayListSweetness) {
        if(arrayListSweetness.size() <= 1) return;
    }
}
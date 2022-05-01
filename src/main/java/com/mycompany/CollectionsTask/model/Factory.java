package com.mycompany.CollectionsTask.model;

import com.mycompany.CollectionsTask.Main;
import com.mycompany.CollectionsTask.controller.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factory {
    
    public Sweetness createSweetness(int id, String title, SweetnessType type, int weight, int sugarContent, Manufacturer manufacturer, int price) {
        return new Sweetness(id, title, type, weight, sugarContent, manufacturer, price);
    }
    
    public static void saveSweetnessArrayListToFile(ArrayList<Sweetness> arr) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(Constants.SAVEDATA_FILE_PATH);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url.getPath()))) {
            oos.writeObject(arr);
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Sweetness> readSweetnessArrayListFromFile() {
        ArrayList<Sweetness> arr = null;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(Constants.SAVEDATA_FILE_PATH);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(url.getPath()))) {
            arr = (ArrayList<Sweetness>) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
        
    public static void saveTestDataToFile() {
        ArrayList<Sweetness> arr = new ArrayList<>();
        arr.add(new Sweetness(12, "Candy #1", SweetnessType.CANDY, 15, 11, Manufacturer.SOUTHERN_BAKERY, 10));
        arr.add(new Sweetness(11, "Candy #1", SweetnessType.CANDY, 15, 11, Manufacturer.SOUTHERN_BAKERY, 10));
        arr.add(new Sweetness(2, "Candy #1", SweetnessType.CANDY, 15, 11, Manufacturer.SOUTHERN_BAKERY, 10));
        arr.add(new Sweetness(3, "Candy #1", SweetnessType.MARSHMALLOW, 15, 11, Manufacturer.NORTHERN_SWEET_SHOP, 10));
        arr.add(new Sweetness(4, "Candy #1", SweetnessType.MARSHMALLOW, 15, 11, Manufacturer.NORTHERN_SWEET_SHOP, 10));
        arr.add(new Sweetness(1, "Candy #1", SweetnessType.CANDY, 15, 11, Manufacturer.NORTHERN_SWEET_SHOP, 10));
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(Constants.SAVEDATA_FILE_PATH);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url.getPath()))) {
            oos.writeObject(arr);
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

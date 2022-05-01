/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CollectionsTask;

import com.mycompany.CollectionsTask.controller.Controller;
import com.mycompany.CollectionsTask.model.Factory;

public class Main {
//    Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:

// Каждый класс должен иметь отражающее смысл название и информативный состав.
// Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
// Наследование должно применяться только тогда, когда это имеет смысл.
// При кодировании должны быть использованы соглашения об оформлении кода java code convention.
// Классы должны быть грамотно разложены по пакетам
// Консольное меню должно быть минимальным.
// Для хранения параметров инициализации можно использовать файлы.

//    2. Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать несколько объектов-конфет. 
//    Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного из параметров. 
//    Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
    
    
    public static void main(String[] args) {
        Factory.saveTestDataToFile();
        Controller.menu();
        
        
    }
}
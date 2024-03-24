package com.hematmal;

import java.util.ArrayList;

public class Waiters {
    PancakeMenu pancakeMenu;
    DinnerMenu dinnerMenu;

    public Waiters(PancakeMenu pancakeMenu, DinnerMenu dinnerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenuItems() {
        System.out.println("_____________________Dinner menu_____________________");
        printDinnerMenu();
        System.out.println("_____________________Pancake menu_____________________");
        printPancakeMenu();
    }

    void printDinnerMenu() {
        
        MenuItem[] items = dinnerMenu.getMenuItems();

        for (int i = 0; i <= 3; i++) {
            System.out.println(items[i].getName());
        }
    }

    void printPancakeMenu() {
        ArrayList<MenuItem> items = pancakeMenu.getMenuItems();

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }
    }
}

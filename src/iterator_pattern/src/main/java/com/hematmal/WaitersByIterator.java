package com.hematmal;

public class WaitersByIterator {
    PancakeMenu pancakeMenu;
    DinnerMenu dinnerMenu;

    public WaitersByIterator(PancakeMenu pancakeMenu, DinnerMenu dinnerMenu) {
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
        
        DinnerMenuIterator iterator = dinnerMenu.createIterator();
        
        while(iterator.hasNext()) {
            
            System.out.println(iterator.next().getName());
        }
    }

    void printPancakeMenu() {
        PancakeMenuIterator iterator = pancakeMenu.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}

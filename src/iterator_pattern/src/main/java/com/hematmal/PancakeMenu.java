package com.hematmal;

import java.util.ArrayList;

public class PancakeMenu {
    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public PancakeMenu() {
        menuItems.add(new MenuItem("roll cake", "Iranian Roll Cake", 0.2, false));
        menuItems.add(new MenuItem("Wafer", "Pakistan Wafer Biscuit", 0.1, false));
        menuItems.add(new MenuItem("Stack", "Stack Biscuit", 0.5, false));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public PancakeMenuIterator createIterator() {
        return new PancakeMenuIterator(this);
    }
}

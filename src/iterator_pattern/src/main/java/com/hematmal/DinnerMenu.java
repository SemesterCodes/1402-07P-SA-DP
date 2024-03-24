package com.hematmal;

public class DinnerMenu {
    MenuItem[] menuItems = new MenuItem[6];

    public DinnerMenu() {
        menuItems[0] = new MenuItem("potato", "Kandahar Potato chips", 1, true);
        menuItems[1] = new MenuItem("biryani", "Kandahar biryani", 2, false);
        menuItems[2] = new MenuItem("pizza", "Anar pizza", 5, false);
        menuItems[3] = new MenuItem("eggplant", "Kandahar eggplant", 0.5, true);
    }

    // This method is no longer needed in iterator implementation
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public DinnerMenuIterator createIterator() {
        return new DinnerMenuIterator(this);
    }
}

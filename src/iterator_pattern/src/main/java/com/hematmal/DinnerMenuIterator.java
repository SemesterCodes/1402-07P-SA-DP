package com.hematmal;

public class DinnerMenuIterator implements iterable {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(DinnerMenu dinnerMenu) {
        items = dinnerMenu.getMenuItems();
    }

    @Override
    public boolean hasNext() {

        if (position > items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

}

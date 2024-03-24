package com.hematmal;

import java.util.ArrayList;

public class PancakeMenuIterator implements iterable {

    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeMenuIterator(PancakeMenu pancakeMenu) {
        items = pancakeMenu.getMenuItems();
    }

    @Override
    public boolean hasNext() {
        if (position > 2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;

        return item;
    }

}

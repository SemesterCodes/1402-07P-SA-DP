package com.hematmal;

public class App 
{
    public static void main( String[] args )
    {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        WaitersByIterator waiters = new WaitersByIterator(pancakeMenu, dinnerMenu);
        waiters.printMenuItems();
    }
}

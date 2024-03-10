package com.hematmal;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("___________Tea___________");
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("___________Coffee___________");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}

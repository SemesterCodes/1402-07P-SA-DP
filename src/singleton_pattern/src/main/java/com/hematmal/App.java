package com.hematmal;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        AboutPage aboutPage = new AboutPage();
        System.out.println("About Page");
        System.out.println(aboutPage.PrintThemeName());

        ContactPage contactPage = new ContactPage();
        System.out.println("Contact Page");
        System.out.println(contactPage.PrintThemeName());

        HomePage homePage = new HomePage();
        System.out.println("Home Page");
        System.out.println(homePage.PrintThemeName());
    }
}

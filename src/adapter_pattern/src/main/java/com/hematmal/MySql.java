package com.hematmal;

public class MySql implements MySqlInterface {
    public void Select() {
        System.out.println("MySQL: Selecting data...");
    }

    public void Create() {
        System.out.println("MySQL: Creating record...");
    }

    public void Delete() {
        System.out.println("MySQL: Deleting record...");
    }

    public void Update() {
        System.out.println("MySQL: Updating record...");
    }
}

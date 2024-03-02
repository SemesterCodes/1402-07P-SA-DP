package com.hematmal;

public class MySQLAdapter implements MySqlInterface {
    MyDatabase myDatabase;

    public MySQLAdapter(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    @Override
    public void Create() {
        myDatabase.Create();
    }

    @Override
    public void Delete() {
        myDatabase.Delete();
    }

    @Override
    public void Select() {
        myDatabase.Select();
    }

    @Override
    public void Update() {
        System.out.println("For update, it's first deleting and then recreating");
        myDatabase.Delete();
        myDatabase.Create();
    }
}

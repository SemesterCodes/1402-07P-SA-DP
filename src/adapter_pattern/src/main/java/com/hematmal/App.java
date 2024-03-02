package com.hematmal;


public class App 
{
    public static void main( String[] args )
    {
        MyDatabase myDatabase = new MyDatabase();
        MySQLAdapter mySQLAdapter = new MySQLAdapter(myDatabase);
        mySQLAdapter.Select();
        mySQLAdapter.Create();
        mySQLAdapter.Delete();
        mySQLAdapter.Update();
    }
}

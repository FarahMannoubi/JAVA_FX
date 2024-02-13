package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabase {


    private final String url = "jdbc:mysql://localhost:3306/farahDataBASE";
    private final String User = "root";
    private final String Pass = "";
    private Connection connection;
    //2.variable de classe
    private static MyDatabase instance;

    //1.const private
    private MyDatabase() {
        try {
            connection = DriverManager.getConnection(url, User, Pass);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

        public static MyDatabase getInstance() {
            if (instance == null)
                instance = new MyDatabase();
            return instance;

        }
    public Connection getConnection() {
        return connection;
    }
















   /* private final String URL = "jdbc:mysql://localhost:3306/farahDataBASE";
    private final String USER = "root";
    private final String PASSWORD = "";
    private Connection connection;
    //2.variable de classe
    private static MyDatabase instance;
//1.Const privare
    private MyDatabase() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
//3.fonction pour tester

    public static MyDatabase getInstance() {
        if(instance == null)
            instance = new MyDatabase();
        return instance;
    }
//4.function public return connection

    public Connection getConnection() {
        return connection;
    }*/
    }

package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager2 {
    private Connection conn;                                 // [1]
    private static DbManager2 dbManagerInstance;              // [2]

    private DbManager2() throws SQLException {                // [3]
        Properties connectionProps = new Properties();        // [4]
        connectionProps.put("user", "kodilla");          // [5]
        connectionProps.put("password", "kodilla");  // [6]
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw"
                        + "&useSSL=False",
                connectionProps);             // [7]
    }                                                       // [8]

    public static DbManager2 getInstance() throws SQLException {  // [9]
        if (dbManagerInstance == null) {                          // [10]
            dbManagerInstance = new DbManager2();                   // [11]
        }                                                         // [12]
        return dbManagerInstance;                                 // [13]
    }                                                           // [14]

    public Connection getConnection() {                          // [15]
        return conn;                                             // [16]
    }                                                            // [17]
}
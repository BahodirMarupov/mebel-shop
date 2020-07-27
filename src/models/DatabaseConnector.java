package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    public static Connection getConnection() throws SQLException {
        try {

            Class.forName("com.mysql.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3307/BM_Mebels",
                "root","");

        return connection;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

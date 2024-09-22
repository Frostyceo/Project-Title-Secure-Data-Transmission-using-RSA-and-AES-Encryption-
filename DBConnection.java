package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/securedb";
    private static final String USER = "root";
    private static final String PASS = "password";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public PreparedStatement prepareStatement(String query, Connection conn) throws SQLException {
        return conn.prepareStatement(query);
    }
}

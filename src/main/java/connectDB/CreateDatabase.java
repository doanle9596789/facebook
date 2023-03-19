package connectDB;

;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hackface?useUnicode=yes&characterEncoding=UTF-8";
    private static final String userNguyen = "root";
    private static final String passNguyen = "10061995";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, userNguyen, passNguyen);
            System.out.println("connection successfully");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }



    public static void main(String[] args) {
        getConnection();

    }
}




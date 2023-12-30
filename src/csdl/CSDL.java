package csdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/QLHSHocSinh", "root", "");
            System.out.println("connect done");
            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

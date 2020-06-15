package dataLayer;

import java.sql.*;

public class DB_user {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/db_ADAM";

    static final String USER = "u";
    static final String PASS = "1";

    public boolean isValidUserLogin(String sUserName, String sUserPassword) {
        boolean isValidUser = false;

        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to datdbase...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating a statement...");
            stmt = conn.createStatement();

            sql = "SELECT * FROM users WHERE user_name = \"" +
                    sUserName + "\" AND user_password = \"" + sUserPassword + "\"";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                isValidUser = true;
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Closing DB Connection - Goodbye!");
        return isValidUser;
    }

}

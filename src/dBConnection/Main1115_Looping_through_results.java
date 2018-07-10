package dBConnection;

import java.sql.*;

public class Main1115_Looping_through_results {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mobfox";
    private static final String CONN_STRING = "jdbc:mysql://mobfox.dev:40001";

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM pclroot_adserver.pcl_uaccounts;");
            while (rs.next()) {
                String columnValue = rs.getString(1);
                System.out.println(columnValue);
            }

            System.out.println("Connected to DB!");
            System.out.println(stmt);
            System.out.println(rs);

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}

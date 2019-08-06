package dBConnection;

import java.sql.*;

public class Main112ConnectMySQL {

    //import driver first - software library tht incapsulates logic we need
    //driver contains Connection (will connect us to DB), ResultSet(incapsulates data returned from DB)
    //...
    //driver: mysql.com/downloads we find Connector/J
    //download mysql-connector-java-5.pack1.46-bin.jar and copy it to clipboard
    //copy this jar file to Libs folder of project
    //  THEN ADD THIS JAR FILE TO PROJECT BUILD PATH - add this file to the libraries of the project
    // File - Project Structure - Libraries - add
    // (right click on the file - Build path - Add to Build Path (Eclipse))

    //interesting - ther eis primary key (user_id) and foreign key (is it what is visible in url?)

    private static final String USERNAME = "root";
    private static final String PASSWORD = "mobfox";
    private static final String CONN_STRING =
            "jdbc:mysql://mobfox.dev:40001";

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        //we need an instance of Statement and instance of ResultSet
        Statement stmt = null;
        //this interface will contain a data, returned from a database
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            //instantiate a statement. default statement object is returned, when you don´´ pass an argument
            //for mysql - the defaultResultSetType is scrollable, it means i can move cursor up and down
            //in many DBs the DefaultResultSetType is forward only, meaning the cursor will start before the data and i will move forward and not be able to move back again
            //that´s why we will overwrite the defaultSetType and get a result set that is scrollable
            //we make a resultSet a constant
            //resultSetConcurrency - it means whether i am working with read only result set or updatable result set
            //we will only reread the data, will not make it updatable
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //we instantiate our result set
            rs = stmt.executeQuery("SELECT * FROM pclroot_adserver.pcl_uaccounts;");
            rs.last(); // move the cursor to the last row

            while (rs.next()){
                String columnValue = rs.getString(1); //you can pass name of the column or the position of the column
                System.out.println(columnValue);
            }

            System.out.println("Connected to DB!");
            System.out.println(stmt);
            System.out.println(rs);
            System.out.println("Number of rows " + rs.getRow()); //how many rows are in the table of database - counting starts from pack1, NOT from 0
            System.out.println(rs);

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            //we shall close objects in reverse order
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            } //if you dont close resource with file base db - it might be ok, if you don´´ close in network environment you minhgt leave a connection open and you might have problems on server

            //resultset has a cursor and in-memory pointer, beginning position - before first row of data
            //the cursor can be before first row of data, in a row of data or after a row of data
            //you need to move a cursor to the first row
            //if you work with scrollable result set, you can move to any particular row
            //if you work with forward cursor - you move it one row at a time, by calling next. next returns a boolean value
            //if suceseeds to move a row with data - returns true
            //no data on a row - returns false
            //when working with forward only cursor the most common approach to use a while loop
            //if it returns data - you process the data
            //if it doesn´t return data - you exit a loop and continue to execute a command
        }


    }

}

package dBConnection.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class pcl_uaccounts {
    //user_id pass_word
    //lets create static methods to process data, it receives single argument 9- data type as a JBC result set
    public static void displayData(ResultSet rs) throws SQLException {
        while (rs.next()) { //as long as there is available data, i will keep on looping
            //lets to collect data from number of columns, appended together to create a string for display.
            // create new object with buffer name and instantiate it with classes constructor
            //get a row number and append it with users number
            StringBuffer buffer = new StringBuffer();
            buffer.append("User " + rs.getInt("user_id") + ": ");  // we pass a Int value - a column, containing a primary key value
            System.out.println(buffer.toString());
        }
    }
}

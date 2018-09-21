package Models;

import java.sql.*;
import java.util.ArrayList;

public class DBConnect {
    private static String user = "root";
    private static String password = "";

    public static ArrayList<String> getPhoneManufacturers() throws SQLException{
        ArrayList<String> manufacturers = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            //connect to database//
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phones?useSSL=false",
                    user, password);

            //create a Statement object//
            statement = conn.createStatement();

            //create the sql query//
            resultSet = statement.executeQuery("SELECT * FROM manufacturers");

            //loop over the results and add it to the ArrayList
            while (resultSet.next())
            {
                manufacturers.add(resultSet.getString("manufacturers"));
            }
        }
        catch (SQLException e){
            System.err.println(e);
        }
        finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
        }
        return manufacturers;
    }
}

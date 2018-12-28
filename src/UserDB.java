import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDB {
    public static Connection connToDb(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/user";
            String dbUN = "root";
            String dbPassword = "mysql";
            conn = DriverManager.getConnection(dbURL, dbUN, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeStaement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closePreparedStaement(Statement cps){
        if(cps != null){
            try {
                cps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

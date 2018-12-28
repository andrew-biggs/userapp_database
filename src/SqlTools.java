import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlTools {

    public static String insert(User aUser){

        Connection conn = UserDB.connToDb();
        PreparedStatement ps = null;
      //  System.out.println("The connection works" + conn );

        String queryInsert = "INSERT INTO new_users (firstname, lastname, username, upassword) VALUES (?,?,?,?)";

        try {
            ps = conn.prepareStatement(queryInsert);
            ps.setString(1, aUser.getFirstName());
            ps.setString(2, aUser.getLastName());
            ps.setString(3, aUser.getUserName());
            ps.setString(4, aUser.getUserPassword());
            ps.executeUpdate();
            return "hello";

        } catch (SQLException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        finally {
            UserDB.closePreparedStaement(ps);
        }
    }
}

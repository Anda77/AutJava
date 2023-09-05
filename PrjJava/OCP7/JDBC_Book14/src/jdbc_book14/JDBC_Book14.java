
package jdbc_book14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC_Book14 {

    /**
     * nu exista nici un commit
     */
    public static void main(String[] args) {
        Logger loger = Logger.getLogger("jdbc_book14.JDBC_Book14");
        try (Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {

            c.setAutoCommit(false);
            String query1 = "INSERT INTO Student values(98, 'Test98', 98)";
            String query2 = "INSERT INTO Student values(101, 'Test101', 1001)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(query1);
            Savepoint sp1 = c.setSavepoint();
            stmt.executeUpdate(query2);
            c.rollback(sp1);
        } 
        catch (SQLException ex) {

            while (ex != null) {
                loger.log(Level.SEVERE, "SQLException");
                loger.log(Level.SEVERE, "SQLState :" + ex.getSQLState());
                loger.log(Level.SEVERE, "Vendor code :" + ex.getErrorCode());
                loger.log(Level.SEVERE, "Message :" + ex.getMessage());
                ex = ex.getNextException();

            }

        }

    }
}

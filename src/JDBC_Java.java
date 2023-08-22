import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Java {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driverClassName
                = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_example_006";
        String username = "db_example_006";
        String password = "db_example_006";
        String query = "insert into cveducation (gpa, faculty, university) values (4, 'HCM', 'HCM')";

        // Load driver class
        Class.forName(driverClassName);

        // Obtain a connection
        Connection con = DriverManager.getConnection(
                url, username, password);

        // Obtain a statement
        Statement st = con.createStatement();

        // Execute the query
        int count = st.executeUpdate(query);
        System.out.println(
                "number of rows affected by this query= "
                        + count);

        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
}

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "System"
            );

            Statement st = con.createStatement();

            int rows = st.executeUpdate(
                "INSERT INTO student VALUES (1, 'Sai Kumar')"
            );

            System.out.println(rows + " row inserted!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

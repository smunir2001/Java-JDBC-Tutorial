import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_JDBC {

    public Test_JDBC() throws SQLException {
        runConnection();
    }

    public void runConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/University";
        String username = "root";
        String password = "Samster123";
        String query = "SELECT * FROM EngineeringStudents";
        String query2 = "SELECT * FROM EngineeringStudents WHERE Department = 'CSE'";

//        try {
//            Class.forName("com.sql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query2);
            while (result.next()) {
                String UniversityData = "";
                // 6 means the number of columns we are reading for each row.
                for (int i = 1; i <= 6; i++) {
                    UniversityData += result.getString(i) + " | ";
                }
                System.out.println(UniversityData);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

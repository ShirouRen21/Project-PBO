import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/aliengame";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    static Connection connection;

    public ConnectDatabase(){
        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connection success");
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }


}

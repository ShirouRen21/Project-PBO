import java.sql.*;

public class RegisterPlayer {

    public static void register(String name) throws SQLException {
        String query = "INSERT INTO player (name, level) VALUES (?,?)";
        PreparedStatement statement = ConnectDatabase.connection.prepareStatement(query);
        statement.setString(1, name);
        statement.setInt(2, 0);
        statement.executeUpdate();
    }

}

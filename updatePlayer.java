import java.sql.*;

public class updatePlayer {
    public static void updateData(int level, String name)throws SQLException{
        String query = "UPDATE player SET level = ? WHERE name = ?";
        try (PreparedStatement statement = ConnectDatabase.connection.prepareStatement(query)) {
            // Set parameter values
            statement.setInt(1, level);
            statement.setString(2, name);

            // Execute the query
            statement.executeUpdate();
        }
    }
}

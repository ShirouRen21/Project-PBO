
import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.*;

public class Display extends JFrame{

    public static void displayData(){

        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        JPanel panel=new JPanel();
        panel.setSize(500,500);
        panel.setLayout(null);
        JLabel recordTitle= new JLabel("Record Data");
        recordTitle.setFont(new Font("Arial", Font.BOLD, 25));
        recordTitle.setBounds(160,10,150,100);
        frame.add(panel);
        panel.add(recordTitle);


        String query = "SELECT * FROM player";

        // Persiapkan statement SQL
        try (PreparedStatement statement = ConnectDatabase.connection.prepareStatement(query)) {
            // Eksekusi query dan ambil hasilnya
            try (ResultSet resultSet = statement.executeQuery()) {

                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Nama");
                tableModel.addColumn("Waktu");

                // Tampilkan hasil
                while (resultSet.next()) {
                    String nama = resultSet.getString("name");
                    int level = resultSet.getInt("level");

                    tableModel.addRow(new Object[]{nama, level});
                }

                JTable jTable = new JTable(tableModel);

                // Buat JScrollPane dan tambahkan JTable ke dalamnya
                JScrollPane scrollPane = new JScrollPane(jTable);
                scrollPane.setBounds(50, 100, 400, 300);
                panel.add(scrollPane);
                // Tampilkan frame
                frame.setVisible(true);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

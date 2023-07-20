/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author RPL-5
 */
public class Koneksi {
    Connection koneksi;

    public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/crudjavafaris", "root", "");

            return koneksi;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

            return null;
        }
    }
}

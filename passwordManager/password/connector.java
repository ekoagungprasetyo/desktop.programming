/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package password;

/**
 *
 * @author ACER
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class connector {
    
    private Connection koneksi;
    public Connection fikskoneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("berhasil konek");
        }catch(ClassNotFoundException ex){
            System.out.println("gagal koneksi"+ex);
        }
        
        String url = "jdbc:mysql://localhost/tb";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("berhasil koneksi database");
        } catch (SQLException ex) {
            System.out.println("gagal koneksi database"+ex);
        }
        return koneksi;
    }
}




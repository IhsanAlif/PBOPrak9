/*
* Nama File    : MySQLPersonDAO.java
* Nama Pembuat : Ihsan Alif Lazuardi Anwar
* NIM          : 24060121140162
* Deskripsi    : File untuk config untuk mengkoneksi ke database MySQL
* Tanggal      : 06 Juni 2023
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // membuat koneksi, nama db, user, password
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
        // kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement st = con.createStatement();
        st.executeUpdate(query);
        // tutup koneksi
        con.close();
    }
}

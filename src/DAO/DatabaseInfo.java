// package DAO;

// import java.lang.System.Logger.Level;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.util.logging.Logger;

// public class DatabaseInfo {
//     public static String user = "sa";
//     public static String password = "duckg0946945409";

//     public static void main(String[] args) {
//         Connection conn = null;

//         try {
//             // dang ky driver
//             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//             conn = DriverManager.getConnection(
//                     "jdbc:sqlserver://localhost:1433;databaseName:QuanLyThuVien;user:sa;password:duckg0946945409;encrypt=false");
//             // String user = "sa";
//             // String password = "duckg0946945409";
//             System.out.println("Connected to SQL Server" + conn.getCatalog());
//         } catch (ClassNotFoundException | SQLException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//             System.out.println("Error");
//         }
//         System.out.println("connected");
//     }

// }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHP2T
 */
public class DatabaseInfo {
    public static String databaseName = "QuanLyThuVien";

    public static Connection getConnection() {
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://localhost:1433/" + databaseName;
            return DriverManager.getConnection(dbUrl, "sa", "duckg0946945409");
            // return DriverManager.getConnection(dbUrl,user, pass);

        } catch (Exception ex) {
            Logger.getLogger(DatabaseInfo.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

    public static void main(String[] args) {
        DatabaseInfo.getConnection();
        System.out.println("Connected to SQL server");
    }
}

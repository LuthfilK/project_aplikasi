
package Koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksi {

    public static Connection MySQL() {
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("root");
            ds.setPassword("");
            ds.setServerName("localhost");
            ds.setDatabaseName("luthfiel");
            ds.setServerTimezone("Asia/Jakarta");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            return c;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
public Connection con ;
public ResultSet res ;
public Statement stat ;

public void koneksi(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            String url ="jdbc:mysql://localhost:3306/luthfiel";
            String user="root";
            String pass="";
           con=DriverManager.getConnection(url,user,pass);
           stat=con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
        }
    } catch (Exception e) {
        System.out.println("Gagal");
    }}

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public static void main(String[] args) {
        try {
            Connection c = MySQL();
            System.out.println(c.getCatalog());
        } catch (Exception e) {
        }
    }
}

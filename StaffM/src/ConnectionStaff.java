
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * , uPass);
 *
 * @author mikaf
 */
public class ConnectionStaff {

    /**
     * public static ConnectionURL getConnection (){
     */
    public static void main(String[] args) throws SQLException {

        ConnectionManager cm = new ConnectionManager();

        ResultSet rs = cm.execQuery("SELECT *  FROM MIKA.PERSONS");

        while (rs.next()) {
            
            String a = rs.getInt("id") + "\t" + rs.getString("firstname");
            System.out.println(rs.getInt("id") + "\t" + rs.getString("firstname"));
        }
// String connectionURL = "jdbc:derby://localhost:1527/StaffInform";
// String uName = "mika";
// String uPass= "2003";
// Connection conn = DriverManager.getConnection(connectionURL,uName,uPass);
//         System.out.println("Connect to database..."); 
// if (conn != null){
// Statement st = conn.createStatement();
// ResultSet rs=null;
// //retrieve the sample records from the Person table
// System.out.println("retrieve the sample records");
// System.out.println("---------------------------------");
// String sql = "SELECT *  FROM MIKA.PERSONS";
            //rs=st.executeQuery(sql);

        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mikaf
 */
public class ConnectionManager {

    private String connectionURL = "jdbc:derby://localhost:1527/StaffInform";
    private String uName = "mika";
    private String uPass = "2003";
    private Connection conn = null;

    public ConnectionManager() {
        initConn();
    }
    
    private void initConn() {
        try {
            conn = DriverManager.getConnection( connectionURL, uName, uPass);
        } catch (Exception e) {
            System.out.println("error");
        }
        
    }
        
    public ResultSet execQuery( String query ) {

        ResultSet rs = null;        
        try {
        Statement st = conn.createStatement();
            rs = st.executeQuery( query );
        } catch(Exception e) {
           System.out.println("error");
           
        }
        return rs;
    }
}

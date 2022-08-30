/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package testconnection;

import javax.sql.DataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author vojtech
 */
public class TestConnection {
    
    public void check() {
        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("jdbc/Library");//"java:comp/env/jdbc/Library");
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("select * from library.book");
            while (res.next()) {
                System.out.println(res.getString("name"));
            }
        } catch (NamingException | SQLException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

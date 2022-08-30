package beans;

import db.Database;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthorList {
    private ArrayList<Author> authors = new ArrayList<>();
    
    private ArrayList<Author> getAuthorsFromBD() {
        try (Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("select * from library.author order by fio asc");) {
            while (res.next()) {
                authors.add(new Author(res.getString("fio")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return authors;
    }
    
    public ArrayList<Author> getAuthors() {
        if (!authors.isEmpty()) {
            return authors;
        } else {
            return getAuthorsFromBD();
        }
    }
}

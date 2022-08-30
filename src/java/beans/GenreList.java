package beans;

import db.Database;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenreList {
    private ArrayList<Genre> genres = new ArrayList<>();
    
    private ArrayList<Genre> getGenresFromBD() {
        try (Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("select * from library.genre order by name");) {
            while (res.next()) {
                Genre genre = new Genre();
                genre.setName(res.getString("name"));
                genre.setId(res.getLong("id"));
                genres.add(genre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenreList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return genres;
    }
    
    public ArrayList<Genre> getGenres() {
        if (!genres.isEmpty()) {
            return genres;
        } else {
            return getGenresFromBD();
        }
    }
}

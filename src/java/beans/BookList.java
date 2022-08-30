package beans;

import db.Database;
import enums.SearchType;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookList {
    private ArrayList<Book> books = new ArrayList<>();
    
    private ArrayList<Book> getBooksFromBD(String str) {
        try (Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(str);) {
            while (res.next()) {
                Book book = new Book();
                book.setId(res.getLong("id"));
                book.setName(res.getString("name"));
                book.setGenre(res.getString("genre"));
                book.setIsbn(res.getString("isbn"));
                book.setAuthor(res.getString("author"));
                book.setPageCount(res.getInt("page_count"));
                book.setPublishDate(res.getInt("publish_year"));
                book.setPublisher(res.getString("publisher"));
                book.setImage(res.getBytes("image"));
                books.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return books;
    }
    
    public ArrayList<Book> getBooks() {
        if (!books.isEmpty()) {
            return books;
        } else {
            return getBooksFromBD("select * from library.book order by name");
        }
    }
    
    public ArrayList<Book> getBooksByGenre(long id) {
        return getBooksFromBD("select b.id,b.name,b.isbn,b.page_count,b.publish_year, p.name as publisher, a.fio as author, g.name as genre, b.image from library.book b "
                + "inner join author a on b.author_id=a.id "
                + "inner join genre g on b.genre_id=g.id "
                + "inner join publisher p on b.publisher_id=p.id "
                + "where genre_id=" + id + " order by b.name "
                + "limit 0,5");        
    }
    
    public ArrayList<Book> getBooksByLetter(String letter) {
        return getBooksFromBD("select b.id,b.name,b.isbn,b.page_count,b.publish_year, p.name as publisher, a.fio as author, g.name as genre, b.image from library.book b "
                + "inner join author a on  b.author_id = a.id "
                + "inner join genre g on b.genre_id = g.id "
                + "inner join publisher p on b.publisher_id = p.id "
                + "where substr(b.name, 1, 1)='" + letter + "'" + " order by b.name asc limit 0, 5");
    }
    
    public ArrayList<Book> getBooksBySearch(String searchStr, SearchType type) {
        StringBuilder sql = new StringBuilder("select b.id,b.name,b.isbn,b.page_count,b.publish_year, p.name as publisher, a.fio as author, g.name as genre, b.image from library.book b "
                + "inner join author a on  b.author_id = a.id "
                + "inner join genre g on b.genre_id = g.id "
                + "inner join publisher p on b.publisher_id = p.id ");
        if (type == SearchType.AUTHOR) {
            sql.append("where lower(a.fio) like '%").append(searchStr.toLowerCase()).append("%' order by b.name asc ");
        } else if (type == SearchType.TITLE) {
            sql.append("where lower(b.name) like '%").append(searchStr.toLowerCase()).append("%' order by b.name asc ");
        }
        sql.append("limit 0, 5");
        return getBooksFromBD(sql.toString());
    }
}

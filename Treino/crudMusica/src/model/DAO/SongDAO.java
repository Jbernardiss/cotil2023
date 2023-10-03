/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import connection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Song;

/**
 *
 * @author aluno
 */
public class SongDAO {
    Connection conn = null;
    
    public void createSong(String title, String author, String album, int durationMinutes, int durationSeconds) throws SQLException, ClassNotFoundException {
        conn = Conn.getConnection();
        
        String sql = "INSERT INTO songLibrary (title, author, album, durationMinutes, durationSeconds) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, title);
        stmt.setString(2, author);
        stmt.setString(3, album);
        stmt.setInt(4, durationMinutes);
        stmt.setInt(5, durationSeconds);
        
        stmt.execute();
        stmt.close();
        
        conn.close();
    }
    
    public void removeSong(int id) throws SQLException, ClassNotFoundException {
        conn = Conn.getConnection();
        
        String sql = "DELETE FROM songLibrary WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        
        stmt.execute();
        stmt.close();
        
        conn.close();
    }
    
    public ArrayList<Song> getAllSongs() throws SQLException, ClassNotFoundException {
        conn = Conn.getConnection();
        ResultSet res;
        ArrayList<Song> songsArray = new ArrayList<>();
        
        int id;
        String title;
        String author;
        String album;
        int durationMinutes;
        int durationSeconds;
                
        
        String sql = "SELECT * FROM songLibrary";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        res = stmt.executeQuery();
        
        while(res.next()) {
            id = res.getInt("id");
            title = res.getString("title");
            author = res.getString("author");
            album = res.getString("album");
            durationMinutes = res.getInt("durationMinutes");
            durationSeconds = res.getInt("durationSeconds");
            
            songsArray.add(new Song(id, title, author, album, durationMinutes, durationSeconds));
        }
        
        conn.close();
        return songsArray;
    }
}

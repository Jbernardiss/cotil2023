/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.SongDAO;
import model.Song;

/**
 *
 * @author aluno
 */
public class SongControl {
    public void create(String title, String author, String album, int durationMinutes, int durationSeconds) throws SQLException, ClassNotFoundException {
        SongDAO songDAO = new SongDAO();
        
        songDAO.createSong(title, author, album, durationMinutes, durationSeconds);
    }
    
    public void remove(int id) throws SQLException, ClassNotFoundException {
        SongDAO songDAO = new SongDAO();
        
        songDAO.removeSong(id);
    }
    
    public ArrayList<Song> getSongs() throws SQLException, ClassNotFoundException {
        ArrayList<Song> songsList;
        SongDAO songDAO = new SongDAO();
        
        songsList = songDAO.getAllSongs();
        
        return songsList;
    }
}

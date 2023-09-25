/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Song {
    
    private int id;
    private String title;
    private String author;
    private String album;
    private int durationMinutes;
    private int durationSeconds;
    
    
    public Song(int id, String title, String author, String album, int lengthMinutes, int lengthSeconds) {
        this.id = id;
        this.author = author;
        this.album = album;
        this.durationMinutes = lengthMinutes;
        this.durationSeconds = lengthSeconds;
    }
    
    public Song(String title, String author, String album, int lengthMinutes, int lengthSeconds) {
        this.author = author;
        this.album = album;
        this.durationMinutes = lengthMinutes;
        this.durationSeconds = lengthSeconds;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    
}

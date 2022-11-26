package com.example.music.model;

import javax.persistence.*;

// @Entity annotations specifies that the class is entity and is mapped to a database table
// @Table annotations specifies the name of the database table to be used to mapping
@Entity
public class Musics {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String MusicName;
    private String MusicType;

    public Musics() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusicName() {
        return MusicName;
    }

    public void setMusicName(String musicName) {
        this.MusicName = musicName;
    }

    public String getMusicType() {
        return MusicType;
    }

    public void setMusicType(String musicType) {
        this.MusicType = musicType;
    }

}

package com.example.music.service;

import com.example.music.model.Musics;
import java.util.List;

public interface MusicService {
    public Musics saveMusic(Musics music);
    public List<Musics> getAllMusics();
    public void deleteMusic();
    public void deleteSpecificMusic(int id);
    public void saveOrUpdate(Musics music, int id);
}

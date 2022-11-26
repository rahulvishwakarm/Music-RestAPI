package com.example.music.service;

import com.example.music.model.Musics;
import com.example.music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicServiceImplementation implements MusicService {
    @Autowired
    private MusicRepository musicRepository;

    @Override
    public Musics saveMusic(Musics music) {
        return musicRepository.save(music);
    }

    @Override
    public List<Musics> getAllMusics() {
        return musicRepository.findAll();
    }

    @Override
    public void deleteMusic() {
        musicRepository.deleteAll();
    }

    @Override
    public void deleteSpecificMusic(int id) {
        musicRepository.deleteById(id);
    }

    @Override
    public void saveOrUpdate(Musics music, int id) {
        System.out.println("Here Is P2"+id);
        Musics getMusic = musicRepository.getReferenceById(id);
        System.out.println("Here Is P3"+id);
        getMusic.setMusicName(music.getMusicName());
        getMusic.setMusicType(music.getMusicType());
        musicRepository.save(getMusic);
    }
}
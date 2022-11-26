package com.example.music.controller;

import com.example.music.model.Musics;
import com.example.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/music")
@CrossOrigin
public class MusicController {
    @Autowired
    private MusicService musicService;

    // get all musics from end point
    // http://localhost:{{port}}/api/v1/music
    @GetMapping("/getAll")
    public List<Musics> getAllMusics() {
        return musicService.getAllMusics();
    }

    // add new music to get point
    // http://localhost:{{port}}/api/v1/music/add
    @PostMapping("/add")
    public String add(@RequestBody Musics music) {
        musicService.saveMusic(music);
        return "Music Added Succesfully";
    }

    // delete all music at end point
    // http://localhost:{{port}}/api/v1/music
    @DeleteMapping("/")
    public String deleteAll() {
        musicService.deleteMusic();
        return "All Music Deleted Succesfully";
    }

    // delete specific music by id
    // http://localhost:{{port}}/api/v1/music/{id}
    @DeleteMapping("/{id}")
    public String deleteSpecific(@PathVariable("id") Musics music) {
        musicService.deleteSpecificMusic(music.getId());
        return "Music "+music.getId()+" is deleted Succesfully!!";
    }

    // http://localhost:{{port}}/api/v1/music/{id}
    @PutMapping("/{id}")
    public String updateMusic(@RequestBody Musics music, @PathVariable("id") Musics musicc) {
        musicService.saveOrUpdate(music,musicc.getId());
        System.out.println("Here Is P1"+musicc.getId());
        return "Music "+musicc.getId()+" is Updated Succesfully!!";
    }

}
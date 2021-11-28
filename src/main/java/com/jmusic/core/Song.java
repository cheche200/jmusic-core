package com.jmusic.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class Song {

    private String title;
    private String author;
    private List<Note> notes;

}

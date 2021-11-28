package com.jmusic.core;

import java.util.Arrays;

public enum Note {
    /* Mayors **/
    A("A"), B("B"), C("C"), D("D"), E("E"), F("F"), G("G");

    private String text;
    Note(String text){
        this.text = text;
    }

    public static Note getNoteByText(String text){
        return Arrays.stream(Note.values())
                .filter(n-> n.text.equalsIgnoreCase(text))
                .findFirst()
                .get();
    }

    public String getText(){
        return this.text;
    }
}

package com.jmusic.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    @Test
    void getNoteByTextTest(){
        assertEquals(Note.A, Note.getNoteByText("A"));
    }

    @Test
    void getNoteByTextTestThrowsNoSuchElementException(){
         Assertions.assertThrows(NoSuchElementException.class, () -> {
            Note.getNoteByText("NonExistingNote");
        });
    }

    @Test
    void getTextTest() {
        assertEquals("A", Note.A.getText());
    }
}
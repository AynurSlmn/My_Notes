package com.example.my_notes;

import java.security.Timestamp;

public class Note {

    @Exclude
    private String id;
    private Timestamp date;
    private String content;

    public Note() {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

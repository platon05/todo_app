package com.example.todo_app.models;

public class Note {
    public String title;
    private final String description;
    public String timeCreated;
    public boolean isChecked;
    public Note() {
        description  = "";
    }
    public Note(String title, String description, String timeCreated, boolean isChecked) {
        this.title = title;
        this.description = description;
        this.timeCreated = timeCreated;
        this.isChecked = isChecked;
    }
    public String getDescription() {
        if (description == null) {
            return "";
        } else {
            return description;
        }
    }

}

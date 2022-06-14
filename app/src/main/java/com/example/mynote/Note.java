package com.example.mynote;

import android.content.Context;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

public class Note {
    private String name;
    private String description;
    public static final Note [] workouts = {
            new Note("Заметка 1","5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Note("Заметка 2",
            "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Note("Заметка 3",
            "Заметка 4\n10 Push-ups\n15 Squats"),
            new Note("Заметка 5",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")};

    private Note (String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getDescription() {return description; }

    public String getName() {return name;}

    public String toString() {
        return this.name; }

}

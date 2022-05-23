package com.practice;

import java.util.ArrayList;

public class Dictionary {

    public Dictionary() {
    }

    public void newEntry(String key, String value, ArrayList<Definition> list) {
        list.add(new Definition(key, value)); //I'm using field from this class!
    }

    public String look(String key, ArrayList<Definition> list) {
        for(Definition i : list) {  //this list field will belong to the object!!!
            if(i.getWord().contains(key)) {
                return i.getDefinition();
            }
        }
        return "Cant find entry for " + key;
    }
}

class Definition {
    private String word, definition;

    public String getWord() {return word;}
    public String getDefinition() {return definition;}

    public Definition(String key, String value) {
        this.word = key;
        this.definition = value;
    }
}
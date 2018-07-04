package models;

import java.io.Serializable;

public class WhatWeDo implements Serializable {
    private int id;
    private String title;
    private String description;
    private String cover;

    public WhatWeDo() {
    }

    public WhatWeDo(String title, String description, String cover,int id) {
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}

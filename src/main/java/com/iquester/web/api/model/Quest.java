package com.iquester.web.api.model;

public class Quest {

    private String id;
    private String title;

    public Quest(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

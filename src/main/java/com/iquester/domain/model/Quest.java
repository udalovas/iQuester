package com.iquester.domain.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.LinkedList;
import java.util.List;

@Entity("quests")
public class Quest {

    @Id
    private String id;
    private String title;
    private List<QuestSpot> questSpots = new LinkedList<QuestSpot>();

    public Quest() {
    }

    public Quest(String id, String title) {
        this.title = title;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<QuestSpot> getQuestSpots() {
        return questSpots;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestSpots(List<QuestSpot> questSpots) {
        this.questSpots = questSpots;
    }
}

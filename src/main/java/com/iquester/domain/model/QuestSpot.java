package com.iquester.domain.model;

public class QuestSpot {

    private long latitude;
    private long longitude;

    public QuestSpot() {
    }

    public QuestSpot(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}

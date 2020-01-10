package com.kodilla.collections.adv.immutable.homework;

public final class Task {

    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }
}

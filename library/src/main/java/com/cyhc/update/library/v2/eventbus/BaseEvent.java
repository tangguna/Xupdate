package com.cyhc.update.library.v2.eventbus;

/**
 * Created by Allen Liu on 2018/01/18.
 */

public class BaseEvent {
    private int eventType;

    public int getEventType() {
        return eventType;
    }

    public BaseEvent setEventType(int eventType) {
        this.eventType = eventType;
        return this;
    }
}

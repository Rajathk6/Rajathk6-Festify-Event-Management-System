package com.Festify.EventManagement.model;

public enum EventStatus {
    Available,
    Sold_Out,
    Cancelled;

    // Optional: Add a method for mapping input strings if needed
    public static EventStatus fromString(String status) {
        return EventStatus.valueOf(status.toUpperCase().replace(" ", "_"));
    }
}
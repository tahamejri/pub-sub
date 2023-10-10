package br.com.assessments.pubsub.Events;

public class Event1 {
    String message ;

    public Event1(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

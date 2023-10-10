package br.com.assessments.pubsub.core;

public class Publisher extends DefaultPublisher {
    private static Publisher instance ;

    public static Publisher getInstance(){
        if (instance == null) {
            instance = new Publisher();
        }
        return instance ;
    }
}

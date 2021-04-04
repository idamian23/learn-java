package io.learnstuff.tutorial.queue;

public class QueueFullException extends Exception {
    public QueueFullException(String errorMessage){
        super(errorMessage);
    }
}

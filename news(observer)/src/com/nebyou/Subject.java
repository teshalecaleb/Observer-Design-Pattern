package com.nebyou;

public interface Subject {
    void AddSubscriber(Subscriber s);
    void RemoveSubscriber(Subscriber s);
    void NotifySubscriber();
}

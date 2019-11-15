package com.nebyou;

import java.util.ArrayList;

public class AradaNews implements Subject{
    private String Address;

    public String getAddress() {
        return Address;
    }

    private ArrayList<Subscriber> subscribers;

    public AradaNews (String Address) {
        super();
        this.Address = Address;
        subscribers = new ArrayList<Subscriber>();
    }

    public void NewsUpdate(){
        NotifySubscriber();
    }

    @Override
    public void AddSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void RemoveSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void NotifySubscriber() {

        for (int i=0;i<subscribers.size();i++){
            subscribers.get(i).Update();
        }
    }
}

package com.nebyou;

public class Main {

    public static void main(String[] args) {
	NewsUpdate newsUpdate = new NewsUpdate();
	AradaNews aradaNews = new AradaNews("www.AradaNews.com");

        aradaNews.AddSubscriber(newsUpdate);
        aradaNews.NewsUpdate();
        aradaNews.RemoveSubscriber(newsUpdate);
    }
}

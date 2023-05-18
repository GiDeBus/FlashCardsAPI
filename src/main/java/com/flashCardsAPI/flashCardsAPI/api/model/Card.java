package com.flashCardsAPI.flashCardsAPI.api.model;

public class Card {

    private int id;
    private String frontSide;
    private String backSide;

    public Card(int id, String frontSide, String backSide) {
        this.id = id;
        this.frontSide = frontSide;
        this.backSide = backSide;
    }

    public int getId() {
        return id;
    }

    public String getFront() {
        return frontSide;
    }

    public String getBack() {
        return backSide;
    }

    public String setFront(String text) {
        this.frontSide = text;
    }

    public String setBack(String text) {
        this.backSide = text;
    }
}

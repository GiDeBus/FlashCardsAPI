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

    public String getFrontSide() {
        return frontSide;
    }

    public String getBackSide() {
        return backSide;
    }

    public void setFrontSide(String text) {
        this.frontSide = text;
    }

    public void setBackSide(String text) {
        this.backSide = text;
    }
}

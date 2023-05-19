package com.flashCardsAPI.flashCardsAPI.api.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CardTest {

    Card card = new Card(1, "test front side of card", "test back side of card");

    @Test
    public void getterMethodsWorks() {
        assertAll("Ensures all properties of Card are retrievable",
                () -> assertEquals(1, card.getId()),
                () -> assertEquals("test front side of card", card.getFrontSide()),
                () -> assertEquals("test back side of card", card.getBackSide())
        );
    }

    @Test
    public void setterMethodsWorks() {
        card.setFrontSide("Front side was changed!");
        card.setBackSide("Back side was changed!");
        assertAll("Ensures all properties of Card are editable",
                () -> assertEquals("Front side was changed!", card.getFrontSide()),
                () -> assertEquals("Back side was changed!", card.getBackSide())
        );
    }
}

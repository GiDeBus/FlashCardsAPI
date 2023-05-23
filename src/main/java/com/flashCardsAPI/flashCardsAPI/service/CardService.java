package com.flashCardsAPI.flashCardsAPI.service;

import com.flashCardsAPI.flashCardsAPI.api.model.Card;
import java.util.Optional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CardService {

    private List<Card> cardList;

    public CardService() {
        cardList = new ArrayList<>();

        Card card = new Card(1, "test front part 1", "test back part 1");
        Card card2 = new Card(2, "test front part 2", "test back part 2");
        Card card3 = new Card(3, "test front part 3", "test back part 3");
        Card card4 = new Card(4, "test front part 4", "test back part 4");
        Card card5 = new Card(5, "test front part 5", "test back part 5");

        cardList.addAll(Arrays.asList(card, card2, card3, card4, card5));
    }

    public java.util.Optional<Card> getCard(Integer id) {
        Optional optional = Optional.empty();
        for(Card card : cardList) {
            if(card.getId() == id) {
                optional = Optional.of(card);
                return optional;
            }
        }
        return optional;
    }
}

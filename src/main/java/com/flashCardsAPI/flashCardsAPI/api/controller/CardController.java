package com.flashCardsAPI.flashCardsAPI.api.controller;

import com.flashCardsAPI.flashCardsAPI.api.model.Card;
import com.flashCardsAPI.flashCardsAPI.service.CardService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    private CardService cardService;

    @Autowired
    public CardController cardController(CardService cardService) {
        this.cardService = cardService;
        return null;
    }

    @GetMapping("/card")
    public Card getCard(@RequestParam int id) {
        Optional card = cardService.getCard(id);

        if(card.isPresent()) {
            return (Card) card.get();
        }

        return null;
    }
}

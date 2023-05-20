package com.flashCardsAPI.flashCardsAPI.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/")
    public @ResponseBody String index() {
        return "Hello!";
    }
}

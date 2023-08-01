package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Dictionary {
    private String[] words = {"Huy", "Trung"};
    private String[] meanings = {"HuyGay` :))", "TrungHoiGay` :D"};

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping({"/lookup"})
    public String lookupWord(@RequestParam("word") String word, Model model) {
        String meaning = null;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                meaning = meanings[i];
                break;
            }
        }
        model.addAttribute("meaning", meaning);
        model.addAttribute("findwrong", word);
        return "index";
    }
}

package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class ConversionAppController {

    @RequestMapping( value = {"/currency", "/"})
    public String currency() {

        return "index";
    }

    @RequestMapping("/convertUTV")
    public String convertUTV(@RequestParam("vndAmount") double vndAmount, Model model) {
        double usdAmount = vndAmount * 23000;
        BigDecimal bigDecimal = BigDecimal.valueOf(usdAmount);
        String numberInString = bigDecimal.toPlainString();
        model.addAttribute("vndAmount", numberInString);
        return "index";
    }

    @RequestMapping("/convertVTU")
    public String convertVTU(@RequestParam("usdAmount") double usdAmount, Model model) {
        double vndAmount = usdAmount / 23000;
        BigDecimal bigDecimal = BigDecimal.valueOf(vndAmount);
        String numberInString = bigDecimal.toPlainString();
        model.addAttribute("usdAmount", numberInString);
        return "index";
    }

    @RequestMapping("/convert")
    public String convert(@RequestParam("exchangeRate") double exchangeRate,
                          @RequestParam("Amount") double Amount,
                          Model model) {
        double convert = Amount * exchangeRate;
        BigDecimal bigDecimal = BigDecimal.valueOf(convert);
        String numberInString = bigDecimal.toPlainString();
        model.addAttribute("Amount", numberInString);
        return "index";
    }
}

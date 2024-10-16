package org.kosta.springstarter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HouseController {

    @GetMapping("/oh")
    public String oh(Model model) {
        return "oh";
    }
}

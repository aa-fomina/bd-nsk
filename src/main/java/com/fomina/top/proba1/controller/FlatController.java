package com.fomina.top.proba1.controller;

import com.fomina.top.proba1.repository.FlatRepository;
import com.fomina.top.proba1.service.FlatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlatController {
    private final FlatRepository flatRepository;
    private FlatService flatService;

    public FlatController(FlatService flatService, FlatRepository flatRepository) {
        this.flatService = flatService;
        this.flatRepository = flatRepository;
    }

    @GetMapping("/flat")
    public String showAll(Model model)
    {
        model.addAttribute("flat", flatService.findAll());

        return "/all";
    }
    @GetMapping("/map-osm")
    public String showAllMap(Model model)
    {
        model.addAttribute("flat", flatService.findAllMetro(200));

        return "flat-map";
    }
}

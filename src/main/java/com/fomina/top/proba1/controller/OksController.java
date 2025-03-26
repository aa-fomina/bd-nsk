package com.fomina.top.proba1.controller;

import com.fomina.top.proba1.entity.Oks;
import com.fomina.top.proba1.service.OksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OksController {
    @Autowired
    private OksService oksService;

    @GetMapping("/oks/{id}")
    public ResponseEntity<Oks> getOksById(@PathVariable int id) {
        Optional<Oks>oks = oksService.getById(id);
        return oks.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
       // return oksService.getById(id);
    }
    }


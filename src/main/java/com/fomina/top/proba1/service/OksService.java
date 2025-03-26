package com.fomina.top.proba1.service;

import com.fomina.top.proba1.entity.Oks;
import com.fomina.top.proba1.repository.OksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OksService {
    @Autowired
    private OksRepository oksRepository;

    public Optional<Oks> getById(int id) {
        //System.out.println(oksRepository.findAllById(id));

        return oksRepository.findById(id);


    }
//    @GetMapping("/")
//    public String index(Model model) {
//        List<Oks> oks = oksRepository.findById2(5);
//        model.addAttribute("oks", oks);
//        return "index";
//    }

}

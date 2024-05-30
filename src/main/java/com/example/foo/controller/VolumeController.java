package com.example.foo.controller;

import com.example.foo.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class VolumeController {

    @Autowired
    VolumeService volumeService;

    @GetMapping("/")
    public String showVolume(){
        return "volume";
    }

    @PostMapping("/")
    public String calculateVolume(@RequestParam("radius") double radius, Model model){
        double volume = volumeService.calculateVolume(radius);
        model.addAttribute("volume",volume);
        return "volume";
    }


}

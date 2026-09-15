package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.Flores;
import com.example.demo.Service.florService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping ("/flores")
public class florController {
    @Autowired 
    florService florService;

    @GetMapping("/listaflores")
    public String getAllFlores(Model model) {
        model.addAttribute("flores", florService.getAllFlores());
        return "listarflores";
    }
    
    @GetMapping("/agregarflores")
    public String showFormForAdd(Model model) {
        model.addAttribute("flor", new Flores());
        return "formflores";
    }
    @PostMapping("/guardar")
    public String guardarFlores(Flores flores) {
        florService.saveFlores(flores);
        return "redirect:/flores/listaflores";
    }
    
}

//http://localhost:8085/flores/listaflores
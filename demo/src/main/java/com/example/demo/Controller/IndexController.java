package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {
    
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/principal")
    public String principal() {
        return "fragments/navbar";
    }

    @GetMapping("/alitas")
    public String alitas() {
        return "alitas";
    }

    
}
 
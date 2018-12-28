package ru.geekbrains.blog1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.blog1.service.impl.MemPostService;

@Controller

public class PosController {

    private final MemPostService memPostService;

    public PosController(MemPostService memPostService) {
        this.memPostService = memPostService;
    }

    @GetMapping("/")
    public String hello (Model model, @RequestParam(required = false) String query){
        model.addAttribute("posts",memPostService.search(query));
        return "hello";
    }
}

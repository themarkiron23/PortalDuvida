package br.com.doubt.point.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fifco")
public class FifcoController {


    @GetMapping
    public String fifco()
    {
       return "fifco";
    }
}

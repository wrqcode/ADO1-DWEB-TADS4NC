package br.senac.tads.dsw.exemplosspringmvs;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/ado1")
public class ExemploController {

    @GetMapping("/curriculo")
    public ModelAndView exemploViewObj(){
        ModelAndView mv = new ModelAndView("curriculo-view");

        mv.addObject("nome", "WILLIAM RIBEIRO QUEIROZ");
        mv.addObject("telefone", "(11) 999991234");
        mv.addObject("dataNasc", "Data de nascimento: 12/06/1990");
        mv.addObject("linkedin", "https://www.linkedin.com/in/williamribeiroqueiroz/");
        mv.addObject("github", "https://github.com/wrqcode");
        return mv;
    }

}

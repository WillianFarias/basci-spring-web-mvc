package br.com.globallabs.springwebmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.globallabs.springwebmvc.model.Jedi;
import br.com.globallabs.springwebmvc.repository.JediRepository;

@Controller
public class JediController {

  @Autowired
  private JediRepository repository;
  
  @GetMapping("/jedi")
  public ModelAndView jedi() {
     
    final ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("jedi");

    modelAndView.addObject("allJedi", repository.getAllJedi());
        
    return modelAndView;
  }

  @GetMapping("/new-jedi")
  public ModelAndView newJedi() {
    
    final ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("new-jedi");

    modelAndView.addObject("jedi", new Jedi());
    return modelAndView;
  }

  @PostMapping("/jedi")
  public String createJedi(@Valid @ModelAttribute Jedi jedi, BindingResult result) {
    
    if (result.hasErrors()) {
      return "new-jedit";
    }

    repository.add(jedi);
    return "redirect:jedi";
  }
}

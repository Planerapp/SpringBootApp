package com.example.Spring_boot_app.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class plannerItemControler {
    private final Logger logger = LoggerFactory.getLogger(plannerItemController.class);
    
  
    @Autowired
    private PlannerItemRepository plannerItemRepository;

    @GetMapping("/")
    public ModelAndView index() {
      ModelAndView modelAndView = new ModelAndView ("index");
      modelAndView.addObject("plannerItems", plannerItemRepository.findAll());
      modelAndView.addObject("today", Instant.now().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek());
     return modelAndView;
}
}

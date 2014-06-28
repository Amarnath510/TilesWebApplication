package com.amarnath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TilesFrontController {

   @RequestMapping(value="/pets", method = RequestMethod.GET)
   public String welcomePets(ModelMap model) {
      // model.addAttribute("msgArgument", "TILES: Maven Java Web Application Project: Success!");

      return "pet-tiles";
   }

   @RequestMapping(value="/dogs", method = RequestMethod.GET)
   public String welcomeDogs(ModelMap model) {
      // model.addAttribute("msgArgument", "TILES: Maven Java Web Application Project: Success!");

      return "dog-tiles";
   }

   
   @RequestMapping(value="/cats", method = RequestMethod.GET)
   public String welcomeCats(ModelMap model) {
      // model.addAttribute("msgArgument", "TILES: Maven Java Web Application Project: Success!");

      return "cat-tiles";
   }

   
   @RequestMapping(value="/Print/{arg}", method = RequestMethod.GET)
   public String welcomeName(@PathVariable String arg, ModelMap model) {
      model.addAttribute("msgArgument", "TILES: Maven Java Web Application Project, input variable: " + arg);

      return "index";
   }
}
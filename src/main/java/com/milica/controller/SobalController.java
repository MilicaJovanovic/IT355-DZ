/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.controller;

import com.milica.model.Soba;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Milica
 */
@Controller
@RequestMapping("/")
public class SobalController {
    @Autowired
    private MessageSource messageSource;
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView hotel(ModelMap model) {
        System.out.println(messageSource.getMessage("bedNumber", null, Locale.ENGLISH));
        return new ModelAndView("soba", "command", new Soba());
    }

    @RequestMapping(value = "/dodajSobu", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Soba hotel, ModelMap model) {
        model.addAttribute("brojKreveta", hotel.getBrojKreveta());
        model.addAttribute("velicina", hotel.getVelicina());
        model.addAttribute("kupatilo", hotel.getKupatilo());
        model.addAttribute("tv", hotel.getTv());
        model.addAttribute("klima", hotel.getKlima());
        model.addAttribute("cenaPoDanu", hotel.getCenaPoDanu());
        return "prikazSobe";
    }

}

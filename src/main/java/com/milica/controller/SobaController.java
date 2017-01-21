package com.milica.controller;

import com.milica.dao.SobaDao;
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
@RequestMapping("/soba")
public class SobaController {
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private SobaDao sobaDao;
    
//    @RequestMapping(method = RequestMethod.GET)
//    public ModelAndView soba(ModelMap model) {
//        System.out.println("Pozivam message source");
//        sobaDao.addSoba();
//        sobaDao.addSobaAround("Soba ima .. kreveta");
//        try {
//            sobaDao.addSobaThrowException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(messageSource.getMessage("bedNumber", null, Locale.ENGLISH));
//        return new ModelAndView("soba", "command", new Soba());
//    }
//        
//    @RequestMapping(value = "/dodajSobu", method = RequestMethod.POST)
//    public String addStudent(@ModelAttribute Soba soba, ModelMap model) {
//        model.addAttribute("brojKreveta", soba.getBrojKreveta());
//        model.addAttribute("velicina", soba.getVelicina());
//        model.addAttribute("kupatilo", soba.getKupatilo());
//        model.addAttribute("tv", soba.getTv());
//        model.addAttribute("klima", soba.getKlima());
//        model.addAttribute("cenaPoDanu", soba.getCenaPoDanu());
//        return "prikazSobe";
//    }    

}

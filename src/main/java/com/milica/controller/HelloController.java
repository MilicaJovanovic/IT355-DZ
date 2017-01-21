package com.milica.controller;

import com.milica.dao.GostDao;
import com.milica.dao.SobaDao;
import com.milica.model.Gost;
import com.milica.model.Soba;
import com.milica.service.GostService;
import com.milica.service.SobaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {
    @Autowired
    SobaDao sobaDao;
    
    @Autowired
    GostDao gostDao;
    
    @Autowired
    SobaService sobaService;
    
    @Autowired
    GostService gostService;
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView defaultPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana kojoj svi mogu pristupe!");
        model.setViewName("hello");
        return model;
    }
    
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Ovo je strana za admine!");
        model.setViewName("admin");
        return model;
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Losi login podaci!");
        }
        if (logout != null) {
            model.addObject("msg", "Izlogovani ste.");
        }
        model.setViewName("login");
        return model;
    }
    
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {
        ModelAndView model = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails)
            auth.getPrincipal();
            System.out.println(userDetail);
            model.addObject("username",
            userDetail.getUsername());
        }
        model.setViewName("403");
        return model;
    }
    
    @RequestMapping(value="/prikazSobe", method=RequestMethod.GET)
    public ModelAndView sobe(ModelAndView modelAndView) {
        List<Soba> sobe= sobaService.getAllSoba();
        modelAndView.addObject("sobe", sobe);
        modelAndView.setViewName("prikazSobe");
        return modelAndView;
    }
    
    @RequestMapping(value="/prikazGosta", method=RequestMethod.GET)
    public ModelAndView gosti(ModelAndView modelAndView) {
        List<Gost> gosti= gostDao.getAllGost();
        for (Gost gost : gosti) {
            System.err.println(gost.toString());
        }
        modelAndView.addObject("gosti", gosti);
        modelAndView.setViewName("prikazGosta");
        return modelAndView;
    }
    
    @RequestMapping(value = "/soba", method = RequestMethod.GET)
    public String addSoba(Model model) {
        model.addAttribute("soba", new Soba());
        return "soba";
    }
    
    @RequestMapping(value= "/soba", method = RequestMethod.POST)
    public ModelAndView addHomeForm(@ModelAttribute("soba") Soba p, ModelAndView model) {
        model.addObject("object", p);
        p.setId(sobaDao.getCount()+1);
        sobaDao.addSoba(p);
        return model;
    }
    
    @RequestMapping(value = "/gost", method = RequestMethod.GET)
    public String addGost(Model model) {
        model.addAttribute("gost", new Gost());
        return "gost";
    }
    
    @RequestMapping(value= "/gost", method = RequestMethod.POST)
    public ModelAndView addGost(@ModelAttribute("gost") Gost p, ModelAndView model) {
        model.addObject("object", p);
        p.setId(gostDao.getCount()+1);
        gostService.addGost(p);
        return model;
    }
	
//    @RequestMapping(method = RequestMethod.GET)
//    public String showHomePage(ModelMap model) {
//        model.addAttribute("message", "Otvorena stranica");
//
//        return "login";
//    }
//
//    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
//    public ModelAndView showAdminPage() {
//        ModelAndView adminPage = new ModelAndView();
//
//        adminPage.addObject("message", "Admin stranica");
//        adminPage.setViewName("admin");
//
//        return adminPage;
//    }
//	
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public ModelAndView login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {
//
//        ModelAndView loginPage = new ModelAndView();
//        if (error != null) {
//            loginPage.addObject("error", "Podaci koje ste uneli nisu ispravni!");
//        }
//        if (logout != null) {
//            loginPage.addObject("msg", "Odjava uspesna!");
//        }
//        loginPage.setViewName("login");
//
//        return loginPage;
//    }
//	
//    @RequestMapping(value = "/403", method = RequestMethod.GET)
//    public ModelAndView accesssDenied() {
//	ModelAndView unauthorisedPage = new ModelAndView();
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (!(auth instanceof AnonymousAuthenticationToken)) {
//            UserDetails userDetail = (UserDetails) auth.getPrincipal();
//            unauthorisedPage.addObject("username", userDetail.getUsername());
//        }
//        unauthorisedPage.setViewName("403");
//        
//        return unauthorisedPage;
//    }
//    
//    @RequestMapping(value = "/dodavanjeSobe", method = RequestMethod.POST)
//    public ModelAndView dodajSobu(ModelMap model) {
//        System.out.println("Poziva se dodavanje sobe");
//        return new ModelAndView("soba", "command", new Soba());
//    }
        
}
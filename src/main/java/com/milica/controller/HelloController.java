/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.controller;

import com.milica.dao.GostDao;
import com.milica.dao.SobaDao;
import com.milica.entities.Gost;
import com.milica.entities.Soba;
import javax.servlet.http.HttpServletRequest;
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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class HelloController {
    
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private GostDao gostDao;
	
    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage(ModelMap model) {
        model.addAttribute("message", "Otvorena stranica");
        return "login";
    }
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndex(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView showAdminPage() {
        ModelAndView adminPage = new ModelAndView();

        adminPage.addObject("message", "Admin stranica");
        adminPage.setViewName("admin");

        return adminPage;
    }
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView loginPage = new ModelAndView();
        if (error != null) {
            loginPage.addObject("error", "Podaci koje ste uneli nisu ispravni!");
        }
        if (logout != null) {
            loginPage.addObject("msg", "Odjava uspesna!");
        }
        loginPage.setViewName("login");

        return loginPage;
    }
	
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {
	ModelAndView unauthorisedPage = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            unauthorisedPage.addObject("username", userDetail.getUsername());
        }
        unauthorisedPage.setViewName("403");
        
        return unauthorisedPage;
    }
    
    @RequestMapping(value = "/soba", method = RequestMethod.GET)
    public String addSoba(Model model) {
        model.addAttribute("soba", new Soba());
        return "soba";
    }
    
    @RequestMapping(value = "/editsoba/{id}", method = RequestMethod.GET)
    public String addSoba(@PathVariable("id") int id, Model model) {
        Soba soba = sobaDao.getSobaById(id);
        model.addAttribute("soba",soba);
        return "soba";
    }
    
    @RequestMapping(value = "/soba", method = RequestMethod.POST)
    public ModelAndView addSoba(@ModelAttribute("soba") Soba soba, ModelAndView model) {
        boolean added = sobaDao.addSoba(soba);
        model.addObject("successMsg", "Soba je dodata");
        model.addObject("soba",soba);
        return model;
    }
    
    @RequestMapping(value = "/prikazSobe", method = RequestMethod.GET)
    public ModelAndView getSobe(ModelAndView model) {
        model.addObject("sobe",sobaDao.getSobe());
        model.addObject("soba", new Soba());
        return model;
    }
    
    @RequestMapping(value = "/deletesoba/{id}", method =
    RequestMethod.GET)
    public String deleteSoba(@PathVariable("id") int id, HttpServletRequest request) {
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            System.out.println("Unable to delete. Product with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        sobaDao.deleteSoba(soba);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/gost", method = RequestMethod.GET)
    public String addGost(Model model) {
        model.addAttribute("gost", new Gost());
        return "gost";
    }
    
    @RequestMapping(value = "/editgost/{id}", method = RequestMethod.GET)
    public String addGost(@PathVariable("id") int id, Model model) {
        Gost gost = gostDao.getGostById(id);
        model.addAttribute("gost",gost);
        return "gost";
    }
    
    @RequestMapping(value = "/gost", method = RequestMethod.POST)
    public ModelAndView addGost(@ModelAttribute("gost") Gost gost, ModelAndView model) {
        boolean added = gostDao.addGost(gost);
        model.addObject("successMsg", "Gost je dodat");
        model.addObject("gost",gost);
        return model;
    }
    
    @RequestMapping(value = "/prikazGosta", method = RequestMethod.GET)
    public ModelAndView getGosti(ModelAndView model) {
        model.addObject("gosti",gostDao.getGosti());
        model.addObject("gost", new Gost());
        return model;
    }
    
    @RequestMapping(value = "/deletegost/{id}", method = RequestMethod.GET)
    public String deleteGost(@PathVariable("id") int id, HttpServletRequest request) {
        Gost gost = gostDao.getGostById(id);
        if (gost == null) {
            System.out.println("Unable to delete. Product with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        gostDao.deleteGost(gost);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
}
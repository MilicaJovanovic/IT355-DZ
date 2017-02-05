/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.controller;

import com.milica.model.Soba;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class HelloController {
	
    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage(ModelMap model) {
        model.addAttribute("message", "Otvorena stranica");

        return "login";
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
    
    @RequestMapping(value = "/dodavanjeSobe", method = RequestMethod.POST)
    public ModelAndView dodajSobu(ModelMap model) {
        System.out.println("Poziva se dodavanje sobe");
        return new ModelAndView("soba", "command", new Soba());
    }
}